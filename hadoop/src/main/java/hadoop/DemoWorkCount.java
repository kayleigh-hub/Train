package hadoop;


//用来统计文件中单词个数
//重写别覆盖mapreduce框架中的map()和reduce()方法

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import javax.swing.text.TabExpander;
import java.io.IOException;
import java.io.PrintStream;

public class DemoWorkCount {
    //map类，第一对kv，是决定数据输入的格式
    //第二对kv，是决定数据的输出格式

    public static class WCMapper extends Mapper<LongWritable, Text,Text,LongWritable>{
        /*
            map阶段数据是一行一行过来的
            并且所有的map的代码逻辑是一模一样的
            每一行数据过来都需要执行代码。
            Context context可以理解成输出的kv。
        */
        @Override
        protected void map(LongWritable key,Text value,Context context) throws IOException,InterruptedException {
            super.map(key, value, context);
            //如果一行有多个单词呢?
            String line = value.toString();


            //通过Context输出Text（一整行数据），1
            context.write(new Text(line),new LongWritable(1));


        }

    }

    //reduce类
    //用来接收map端输出的数据

    //map输出的数据和reduce接收的数据是一样的
    public static class WCReduce extends Reducer<Text,LongWritable,Text,LongWritable>{
        @Override
        //变成了Iterable迭代器
        //对values进行整体的求和
    protected void reduce(Text key,Iterable<LongWritable> values,Context context) throws IOException, InterruptedException {
            /**
             * reduce集合程序  每一个k都会调用一次这个方法
             * 默认是一个节点
             * key:就是每一个单词
             * values：map端当前k所对应的所有的v
             */
            long sum = 0l;
            for (LongWritable value : values) {
                sum = sum + value.get();

            }
            //输出把计算结果输出到hdfs
            context.write(key,new LongWritable(sum));
        }
    }
    //是当前mapreduce程序入口
    //并且用来构建mapreduce程序
    public static void main(String[] args) throws Exception{
        //创建一个job任务
        Job job = Job.getInstance();
        //指定job名称
        job.setJobName("第一个mr程序，单词统计");
        //构建mr
        //指定当前main所在类名()(识别具体的类)
        job.setJarByClass(DemoWorkCount.class);
        //指定map端的类
        job.setMapperClass(WCMapper.class);

        //指定map输出的kv类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(LongWritable.class);
        //指定reduce端的类
        //指定reduce端输出的kv类型
        job.setReducerClass(WCReduce.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(LongWritable.class);

        //指定输入路径
        Path in = new Path("master:/word");
        FileInputFormat.addInputPath(job,in);
        //指定输出
        Path out = new Path("/output");
        //如果路径存在删除
        FileSystem fileSystem = FileSystem.get(new Configuration());
        if(fileSystem.exists(out)){
            //true表示迭代删除
            fileSystem.delete(out,true);
        }
        //如果不存在添加输出路径
        FileOutputFormat.setOutputPath(job,out);

        //启动任务
        job.waitForCompletion(true);
        System.out.println("正在ing中");

        /**
         * 提交任务
         * 1.通过maven中package功能将项目打包上传到服务器
         * 2.执行任务 hadoop jar hadoop-mapreduce-examples-2.7.6.jar hadoop/DemoWorkCount.java /word /output
         *
         */

    }

}
