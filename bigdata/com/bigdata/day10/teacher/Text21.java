package com.bigdata.day10.teacher;
import java.util.Scanner;
public class Text21 {
    public static void main(String[] args) {
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
        String[] arr = {"hello","world","java","mysql","springboot","hadoop","hive","hbase","spark","flink"};
        String word = new Scanner(System.in).nextLine();
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        boolean flag = false;
        for(int i = 0;i < arr.length;i++){
            if(word.equals(arr[i])) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("有");
        }else {
            System.out.println("没有");
        }

    }
}
