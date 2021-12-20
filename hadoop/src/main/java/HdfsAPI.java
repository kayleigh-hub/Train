import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.util.Arrays;

public class HdfsAPI {
    FileSystem fs;

    //1.获取hdfs文件管理系统
    @Before
    public void main() throws Exception {
        //获取配置文件
        Configuration configuration = new Configuration();
        //通过配置文件可以手动更改配置文件
        configuration.set("dfs.replication", "1");
        //获取链接地址，hdfs
        URI uri = new URI("hdfs://master:9000");
        //获取hdfs伤的文件管理系统的对象，通过对象对hdfs进行操作
        fs = FileSystem.get(uri, configuration);

    }
    @Test
    //这是文件系统（hdfs）中的创建文件夹的操作
    public void mk() throws Exception{
        boolean mkdirs = fs.mkdirs(new Path("/test/2"));
        System.out.println(mkdirs);
    }


    public void input() throws Exception{

    }
    //这是文件系统（hdfs）中删除文件的操作
    @Test
    public void del() throws Exception{
        //注意这个false表示的是是否可以迭代删除，false表示不可以，为true可以
        boolean delete = fs.delete(new Path("/test/1"),false);
        System.out.println(delete);
    }
    @Test
    //这里是查看文件的状态
    public void listStatus() throws Exception{
        //查看目录下文件列表
        FileStatus[] fileStatuses = fs.listStatus(new Path("/data"));
        //表示获取一个一个单个文件
        for (FileStatus fs : fileStatuses){
            //Block的大小固定128
            System.out.println(fs.getBlockSize());
            //实际的数据量
            System.out.println(fs.getLen());
            System.out.println(fs.getSymlink());
            //之前在配置的时候，设置的副本数是1，所以这里显示的就是1
            System.out.println(fs.getReplication());
            //权限
            System.out.println(fs.getPermission());
            //详细的地址
            System.out.println(fs.getPath());

        }
    }

    @Test//文件切分一个block
    public void listBlockLocation() throws Exception{
        //这里是数组的原因就是块在切分的时候，不固定，可能是一个可能是多个
        //getFile获取某个文件的block的位置
        BlockLocation[] fbl = fs.getFileBlockLocations(new Path("/data/students.txt"), 0, 10);
        for (BlockLocation blockLocation : fbl) {
            System.out.println(blockLocation.getHosts());

            System.out.println(blockLocation.getLength());
            String[] names = blockLocation.getNames();
            for(String s : names){
                System.out.println(s);
            }
            System.out.println(blockLocation.getOffset());
            System.out.println(blockLocation.getTopologyPaths());
        }
    }


    //切分多个block
    @Test
    public void getBlockLocation()throws Exception{
        BlockLocation[] fileBlockLocations = fs.getFileBlockLocations(new Path("/data/students.txt"), 0, 10);
        for (BlockLocation blockLocation : fileBlockLocations) {
            String[] hosts = blockLocation.getHosts();
            for (int i = 0; i < hosts.length; i++) {
                System.out.println(hosts[i]);
                System.out.println(Arrays.toString(blockLocation.getNames()));

                for (String s : hosts) {
                    System.out.println(s);
                }
                System.out.println(blockLocation.getOffset());
            }
        }
    }

    @Test
    //这个是下载文件
    public void open() throws Exception{
        FSDataInputStream open = fs.open(new Path("/data/students.txt"));
        //封装成缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(open));
        String line;
        while((line= br.readLine())!=null){
            System.out.println(line);
        }
        open.close();
    }

    //hdfs上的文件不允许被修改，是文件切分机制的导致不能修改
    //想要修改必须重新创建上传
    //这个是上传文件
    @Test
    public void create() throws Exception{
        FSDataOutputStream fsDataOutputStream = fs.create(new Path("/data/student1.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fsDataOutputStream));
        //写内容进去
        bw.write("nihao");
        bw.write("shijie");
        bw.flush();
        //追加文件
        //这是换行
        bw.newLine();
        bw.write("shijienihao");
        fsDataOutputStream.close();
    }
}