package com.bigdata.day05;

/*
    格式
        (关系表达式)?表达式1：表达式2；
        如果条件为true，运算后的结果是表达式1；
        如果条件为false，运算后的结果是表达式2；

     执行流程：
        1、首先判断关系表达式中的结果，
        2、如果说判断关系表达式的结果为true,执行冒号前面的表达式1
        3、如果说判断关系表达式的结果为false，执行冒号后面的表达式2

     注意事项：
        1、关系表达式的小括号不能省略
        2、如果后面的表达式只是一个值或者一个变量，小括号可以省略
        3、如果后面的表达式需要进行一些运算，小括号不能省略

 */
public class OptSanMuDemo {
    public static void main(String[] args) {
        boolean b = (1>3)?(true):(false);
        System.out.println(b);

        int x = 10;
        int i = (x++ == 11)?(x++):x;
        System.out.println(i);
        System.out.println(x);

        int x1 = 13;

        //三目运算表达式的结果数据类型由表达式中最高的数据类型接收
        double i2 = (x1++ == 12)?x1:((x1*1.0)/2);
        System.out.println(i2);
        System.out.println(x1);
    }
}
