package com.bigdata.day05;

/*
        &&,||

        结论：
            1、单纯从结果上来看，&&与&的结果是一样的
            2、&&又称之为短路与，左边如果是false，结果就是false，不会执行右边的内容
               ||又称之为短路或，左边如果为true的时候，结果就是true，不会执行右边的内容

        注意：
            在Java中不可以写成3<x<6，应该写成x>3 & x<6
 */
public class OptLuojiDemo2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

//        System.out.println((a>c) & (a>b)); // false & false = false
//        System.out.println((a>b) & (a<c)); // false & true = false
//        System.out.println((a<b) & (a>c)); // true & false = false
//        System.out.println((a<b) & (a<c)); // true & true = true
//        System.out.println("====================================");
//
//        //逻辑双与操作
//        System.out.println((a > c) && (a > b)); // false && false = false
//        System.out.println((a > b) && (a < c)); // false && true = false
//        System.out.println((a < b) && (a > c)); // true && false = false
//        System.out.println((a < b) && (a < c)); // true && true = true

        System.out.println("====================================");
        int x = 3;
        int y = 4;

//        boolean bool1 = ((x++ == 3) & (y++ ==4));
//        System.out.println(bool1);
//        System.out.println(x);
//        System.out.println(y);

//        boolean bool2 = ((x++ == 5) & (y++ ==4));
//        System.out.println(bool2);
//        System.out.println(x);
//        System.out.println(y);

//        boolean bool2 = ((x++ == 5) && (y++ ==4));
//        System.out.println(bool2);
//        System.out.println(x);
//        System.out.println(y);

//        boolean bool2 = ((x++ == 5) | (y++ ==4));
////        System.out.println(bool2);
////        System.out.println(x);
////        System.out.println(y);

        boolean bool2 = ((x++ == 3) || (y++ == 8));
        System.out.println(bool2);
        System.out.println(x);
        System.out.println(y);




    }
}
