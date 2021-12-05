package com.bigdata.day05;

/*
        键盘录入：
            使用键盘录入的原因：
                我们目前在写程序的时候，数据值都是固定的，
                但是实际开发中，数据值肯定是变化的，
                所以，我准备把数据改进为键盘录入，提高程序的灵活性。
            使用步骤：
                1、导包
                    import java.util.Scanner;
                2、创建Scanner对象
                    Scanner sc = new Scanner(System.in);
                3、调用对象中的方法，接收键盘录入的信息
                        sc.nextInt()

         注意事项：
            1、调用的方法接收的数据是什么类型，就用对应方法类型的变量接收
            2、键盘录入的数据必须和调用方法的类型一致，不然会报错
                java.util.InputMismatchException 输入不匹配异常



 */

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        //创建对象
        Scanner sc = new Scanner(System.in);


        //使用对象中的方法，接收一个int类型的数据
        //使用对象sc中的nextInt()方法，接收一个键盘录入的int类型的数据
        //定义一个int类型的变量i,接收数据
        int i = sc.nextInt(); //等待我们键盘录入数据
        System.out.println("键盘录入的数据为：" + i);


    }
}
