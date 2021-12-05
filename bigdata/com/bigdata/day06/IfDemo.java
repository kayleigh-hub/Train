package com.bigdata.day06;

/*
        if语句的第三种格式可以省略else，但是省去了就不是三个格式其中的了

        需求：
            键盘录入两个数据，比较两数大小
 */


import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int x1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int x2 = sc.nextInt();

        //三目运算符实现
        int res = (x1 > x2) ? x1 : x2;
        System.out.println("最大值是：" + res);

        //if条件语句实现
        if (x1 > x2) {
            System.out.println("x1是较大的数，值为：" + x1);
        } else if (x2 > x1) {
            System.out.println("x2是较大的数，值为：" + x2);
        }

    }


}
