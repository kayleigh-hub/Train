package com.bigdata.day08.homeworkday08;

/*
        3.输入一批整数，使用循环求出最大值与最小值，输入0时结束。
 */

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        int maxNum = 0;


        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (maxNum < number) {
                maxNum = number;
            }
        }

        System.out.println("输入的最大值为：" + maxNum);

    }
}
