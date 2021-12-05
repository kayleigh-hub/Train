package com.bigdata.day05;

/*
        需求1：获取两个数中较大的数据
        需求2：获取三个数中较大的数
        需求3：比较两个整数是否相同

            使用三目运算符解决
 */
public class OptTest1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 40;

        //三目运算符 需求1
        int result = (a > b) ? a : b;
        System.out.println(result);

        //三目运算符 需求2
        int max = (result > c) ? result : c;
        System.out.println("三个数中最大值为：" + max);

        int x = 11;
        int y = 12;
        //三目运算符 需求3
        boolean res2 = (x == y) ? true : false;
        System.out.println("x与y进行比较：" + res2);


    }
}
