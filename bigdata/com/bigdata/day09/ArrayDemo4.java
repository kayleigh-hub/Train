package com.bigdata.day09;

/*
        数组元素查找(查找指定元素第一次在数组中出现的索引)

        键盘录入一个数，去数组中查找

        3,13,21,3214,3,12,3,24,3,212,3,1,21,3124,21,3

 */

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //定义一个数组（静态初始化的方式）
        int[] arr = {3, 13, 21, 3214, 3, 12, 3, 24, 3, 212, 3, 1, 21, 3124, 21, 3};

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查找的数字：");
        int number = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println(number + "数第一次出现在数组中的索引为：" + i);
                break;
            }

            if (i == arr.length - 1) {
                System.out.println("您输入的数：" + number + "在数组中没有找到！");
            }
        }


    }
}
