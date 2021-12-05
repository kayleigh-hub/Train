package com.bigdata.homework;
import java.util.Scanner;

/*
        这个是求输出输入的三个数字的最大的值
 */
public class GeiMaxNum {
    public static void main(String[] args) {
        //这里输入第一个数
        System.out.println("输入第一个数");
        int a = new Scanner(System.in).nextInt();
        //这里输入第二个数
        System.out.println("输入第二个数");
        int b = new Scanner(System.in).nextInt();
        //这里输入第三个数
        System.out.println("输入第三个数");
        int c = new Scanner(System.in).nextInt();
        //对输入的数字进行比较。这里推荐使用三目运算符，a > b ? a : b
//        int max = a > b ? a : b;
//        max = max > c ? max : c ;
//        System.out.println(max);
        int max = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(max);


    }
}
