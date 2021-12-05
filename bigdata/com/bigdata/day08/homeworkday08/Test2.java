package com.bigdata.day08.homeworkday08;

/*
        输入圆形半径，求圆形的周长和圆形的面积,并将结果输出

        圆的面积：PI*半径^2
        圆的周长：2*PI*半径
 */
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double r = sc.nextDouble();

        System.out.println("圆的面积为："+(3.14*(r*r)));
        System.out.println("圆的周长为："+(2*3.14*r));


    }
}
