package com.bigdata.day07;

/*
        需求1：请输出一个4行5列的星星(*)图案

        * * * * *
        * * * * *
        * * * * *
        * * * * *

        需求2：	用循环实现打印如下三角形的*图案
            *
			*   *
			*   *   *
			*   *   *   *
			*   *   *   *   *


 */
public class ForNestDemo {
    public static void main(String[] args) {
        //输出一个*
//        System.out.println("*");

        //输出5个*
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");
//        System.out.println("*");

        //使用java的输出语句另外一种格式,将5个*输出在一行
//        System.out.print("*\t");
//        System.out.print("*\t");
//        System.out.print("*\t");
//        System.out.print("*\t");
//        System.out.print("*\t");

        //for循环改进打印一行
//        for(int i=1;i<=5;i++){
//            System.out.print("*\t");
//        }
//        System.out.println();
//
//        for(int i=1;i<=5;i++){
//            System.out.print("*\t");
//        }
//        System.out.println();
//
//        for(int i=1;i<=5;i++){
//            System.out.print("*\t");
//        }
//        System.out.println();
//
//        for(int i=1;i<=5;i++){
//            System.out.print("*\t");
//        }
//        System.out.println();


        //用for循环改进打印4行5列的*
        for (int i = 1; i <= 4; i++) { // 外层的for循环控制的是行
            for (int j = 1; j <= 5; j++) {//内层的for循环控制的是列
                System.out.print("*\t");
            }
            System.out.println();
        }

        System.out.println("===========需求2====================");
        /**
         *
         *
         *          *
         * 			*   *
         * 			*   *   *
         * 			*   *   *   *
         * 			*   *   *   *   *
         *
         * 	分析：
         * 	    1、总共有5行5列，我们可以先打印5行5列
         * 	    *   *   *   *   *
         * 	    *   *   *   *   *
         * 	    *   *   *   *   *
         * 	    *   *   *   *   *
         * 	    *   *   *   *   *
         *
         * 	    2、
         *
         * 	    *                    第一行1个星，i=1,j=1
         *      *   *                第二行2个星，i=2,j=2
         *      *   *   *            第三行3个星，i=3,j=3
         *      *   *   *   *        第四行4个星，i=4,j=4
         *      *   *   *   *   *    第五行5个星，i=5,j=5
         *
         *
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println("==================================");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        System.out.println("===========打印9行9列的*三角型===========");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        System.out.println("===========打印九九乘法表===========");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                //1*1=1   1*2=2
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }


    }
}
