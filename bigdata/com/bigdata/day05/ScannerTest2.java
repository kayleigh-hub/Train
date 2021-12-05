package com.bigdata.day05;

/*

        需求：键盘录入两个数据，获取这两个数据中的最大值
            (先不考虑两个数据相等的情况)

        分析：
            1、导包
            2、创建键盘录入对象
            3、调用方法，输入两个数据
            4、三目运算符求出两个数中的最大值
            5、输出


 */

import java.util.Scanner;
public class ScannerTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //调用方法，输入两个数据
        System.out.println("请输入第一个int类型的数据：");
        int i = sc.nextInt();
        System.out.println("请输入第二个int类型的数据：");
        int j = sc.nextInt();


        //三目运算符求出两个数中的最大值
        int max = (i > j) ? i : j;

        //输出
        System.out.println("输入的两个数中，最大值为：" + max);


    }
}
