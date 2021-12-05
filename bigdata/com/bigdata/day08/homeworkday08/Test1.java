package com.bigdata.day08.homeworkday08;


/*
        1.输入自己的名字，年龄和性别，分别用不同的变量接收，并将输入的信息做输出。
 */

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your name here:");
        String name = sc.next();

        System.out.println("Please input your age here:");
        int age = sc.nextInt();

        System.out.println("Please input gender here:");
        String gender = sc.next();

        System.out.println("The Computer recorded that ：");

        System.out.println("Your name is：" + name);
        System.out.println("Your age is：" + age);
        System.out.println("Your gender is：" + gender);



    }
}
