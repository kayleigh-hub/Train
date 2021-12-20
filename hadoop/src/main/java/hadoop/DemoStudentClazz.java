package hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.junit.Test;

import java.io.IOException;

public class DemoStudentClazz {
    public static class SumMApper extends Mapper<LongWritable, Text,Text,LongWritable>{
        @Override
        protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, LongWritable>.Context context) throws IOException, InterruptedException {
            String line = value.toString();
            //按逗号切分
            String[] split = line.split(",");
            LongWritable age = new LongWritable(Integer.valueOf(split[2]));
            String clazz = split[4];
            context.write(new Text(clazz),age);
        }
    }

    public static class SumReduce extends Reducer<Text,LongWritable,Text,LongWritable>{
        @Override
        protected void reduce(Text key, Iterable<LongWritable> values, Reducer<Text, LongWritable, Text, LongWritable>.Context context) throws IOException, InterruptedException {
            long sum = 0l;
            for (LongWritable value : values) {
                sum+=value.get();
            }
            context.write(key,new LongWritable(sum));
        }
    }

    public static void main(String[] args) throws Exception{
        //创建一个job任务
        Job job = Job.getInstance();
        //指定job名称
        job.setJobName("第一个mr程序，单词统计");
        //构建mr
        //指定当前main所在类名()(识别具体的类)
        job.setJarByClass(DemoStudentClazz.class);
        //指定map端的类
        job.setMapperClass(DemoStudentClazz.SumMApper.class);

        //指定map输出的kv类型
        job.setMapOutputKeyClass(Text.class);
        job.setMapOutputValueClass(LongWritable.class);
        //指定reduce端的类
        //指定reduce端输出的kv类型
        job.setReducerClass(DemoStudentClazz.SumReduce.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(LongWritable.class);

        //指定输入路径
        Path in = new Path("/data");
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
        System.out.println("改进的正在ing中");

        /**
         * 提交任务
         * 1.通过maven中package功能将项目打包上传到服务器
         * 2.执行任务 hadoop jar hadoop-mapreduce-examples-2.7.6.jar hadoop/DemoWorkCount.java /word /output
         *
         */



    }
}
