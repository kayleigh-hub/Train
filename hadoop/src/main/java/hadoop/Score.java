package hadoop;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;


public class Score {

    //Map类
    public static class MyMapper extends Mapper<Object, Text, Text, FloatWritable>
    {

        @Override
        protected void map(Object key, Text value, Mapper<Object, Text, Text, FloatWritable>.Context context)
                throws IOException, InterruptedException {
            // TODO Auto-generated method stub
            String val = value.toString();
            String [] vals = val.split("");  //一定要注意这个空格只空一次，空多了会出错。比如你空两个，文本里没有两个的，那就不会被分割，最后还是一整行为一列，然后下面的转换成小数那里就没有2了，就会报错说下标不对

            float sc = Float.parseFloat(vals[2]);
            context.write(new Text(vals[0]), new FloatWritable(sc));
        }
    }

    //Reducer
    // liming {90, 80}
    public static class MyReducer extends Reducer<Text, FloatWritable, Text, FloatWritable>
    {

        @Override
        protected void reduce(Text key, Iterable<FloatWritable> values,
                              Reducer<Text, FloatWritable, Text, FloatWritable>.Context context)
                throws IOException, InterruptedException {
            // TODO Auto-generated method stub
            float sum = 0;
            int i = 0;
            for(FloatWritable value : values)
            {
                sum += value.get();
                i++;
            }
            sum = sum / i;
            context.write(key, new FloatWritable(sum));
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException
    {
        // TODO Auto-generated method stub
        if(args.length<2)
        {
            System.out.println("the arguments are adfadf");
            System.exit(0);
        }
        Configuration conf = new Configuration();

        String []arg = new GenericOptionsParser(conf, args).getRemainingArgs();
        @SuppressWarnings("deprecation")
        Job job = new Job(conf, "score");     //设置环境参数
        job.setJarByClass(Score.class);     //设置整个程序的类名(驱动类)

        job.setMapperClass(MyMapper.class);     //添加 Mapper类
        job.setReducerClass(MyReducer.class);   //添加Reducer类

        job.setOutputKeyClass(Text.class);      //设置输出类型
        job.setOutputValueClass(FloatWritable.class);

        FileInputFormat.addInputPath(job, new Path(args[0]));    //设置输入文件
        FileOutputFormat.setOutputPath(job, new Path(arg[1]));   //设置输出文件
        System.exit(job.waitForCompletion(true)?0:1);

    }
}

