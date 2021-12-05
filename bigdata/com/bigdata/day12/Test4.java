package com.bigdata.day12;
/*
        定义一个类MyMath,提供基本的加减乘除功能，然后进行测试

        导包import语句在所有的class之前
 */


import java.util.Scanner;

class MyMath {
    //加法功能
    public int add(int a, int b) {
        return a + b;
    }

    //减法功能
    public int sub(int a, int b) {
        return a - b;
    }

    //乘法功能
    public int mul(int a, int b) {
        return a * b;
    }

    //除法功能
    public double div(int a, int b) {
        return (a * 1.0) / b;
    }
}


public class Test4 {
    public static void main(String[] args) {
        MyMath compute = new MyMath();
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据num1：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数据num2：");
        int num2 = sc.nextInt();

        System.out.println("num1+num2=" + compute.add(num1, num2));
        System.out.println("num1-num2=" + compute.sub(num1, num2));
        System.out.println("num1*num2=" + compute.mul(num1, num2));
        System.out.println("num1/num2=" + compute.div(num1, num2));

    }
}


