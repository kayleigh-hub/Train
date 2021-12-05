package com.bigdata.day10.teacher;
/*
      1.数组查找操作：定义一个长度为10的一维字符串数组，
        在每一个元素存放一个单词；然后运行时从命令行输入一个单词，
        程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，
        不包含就打印出“No”。

     分析：
        1、定义一个长度为10的字符串数组
        2、键盘录入一个单词
        3、遍历数组判断输入的字符串是否存在于数组中
        4、如果存在，Yes，如果不存在，No
 */
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        //定义一个长度为10的字符串数组
        String[] arr = {"hello","world","java","mysql","springboot","hadoop","hive","hbase","spark","flink"};

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //键盘录入一个单词
        System.out.println("请输入你要查找的单词");
        String word = sc.next();

        //定义一个标志，表示是否找到
        boolean flag = false;

        //遍历数组判断输入的字符串是否存在于数组中
        for(int i=0;i<arr.length;i++){
            //判断字符串内容是否相同，调用字符串对象的equals(需要比较的字符串)方法
            if(word.equals(arr[i])){
//                System.out.println("Yes");
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }



    }
}
