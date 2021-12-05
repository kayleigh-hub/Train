package com.bigdata.day07;

/*
    方法的重载:
        在同一个类中，方法名一样，参数列表不一样，这样的现象称之为方法的重载
        其中方法的重载与返回值类型无关

 */
public class FunctionDemo3 {
    public static void main(String[] args) {
        //需求:计算两个数的和
        int a = 10;
        int b = 20;
        System.out.println(sum(a, b));

        //需求:计算三个数的和
        int c = 30;
        System.out.println(sum(a, b, c));

        //需求:计算四个数的和
        int d = 40;
        System.out.println(sum(a, b, c, d));

    }

    //定义一个方法，实现两个数之和

    /**
     * 返回值类型：int
     * 参数列表：两个int类型的参数
     */
    public static int sum(int x1, int x2) {
        return x1 + x2;
    }


    public static int sum(int x1, int x2, int x3) {
        return x1 + x2 + x3;
    }

    public static int sum(int x1, int x2, int x3, int x4) {
        return x1 + x2 + x3 + x4;
    }
}
