package com.bigdata.day05;
/*
        需求：键盘录入两个数据，并对这两个数据求和，输出其结果

        分析：
            1、导包
            2、创建键盘录入对象
            3、调用方法，键盘录入两个int类型的数据
            4、求和
            5、输出



 */

import java.util.Scanner;

public class ScannerTest1 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //调用两次方法，键盘录入两个int类型的数据
        System.out.println("请输入第一个int类型的数据：");
        int i = sc.nextInt();
        System.out.println("请输入第二个int类型的数据：");
        int j = sc.nextInt();

        //求和
        int res = i + j;

        //输出
        System.out.println("i+j=" + res);


    }
}
