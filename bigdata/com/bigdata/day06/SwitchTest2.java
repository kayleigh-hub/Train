package com.bigdata.day06;

/*
    用switch语句实现键盘录入月份，输出对应的季节

    春季：3-5
    夏季：6-8
    秋季：9-11
    冬季：12 - 2

 */
import java.util.Scanner;
public class SwitchTest2 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你想知道季节的月份(1-12)：");
        int month = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("冬季");
                break;
            case 2:
                System.out.println("冬季");
                break;
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("春季");
                break;
            case 5:
                System.out.println("春季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("夏季");
                break;
            case 8:
                System.out.println("夏季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("秋季");
                break;
            case 11:
                System.out.println("秋季");
                break;
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("您输入的月份有误");
                break;
        }

    }
}
