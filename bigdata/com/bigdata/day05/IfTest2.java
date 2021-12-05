package com.bigdata.day05;

/*
        键盘录入月份的值，输出对应的季节

        3-5  春季
        6-8  夏季
        9-11 秋季
        12-2 冬季
 */
import java.util.Scanner;
public class IfTest2 {
    public static void main(String[] args) {

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //接收键盘录入的数据
        System.out.println("请输入你想要知道季节的月份：");
        int month = sc.nextInt();

        if(3<=month & month<=5){
            System.out.println("春季");
        }else if(6<=month & month<=8){
            System.out.println("夏季");
        }else if(9<=month & month<=11){
            System.out.println("秋季");
        }else if(month==12){
            System.out.println("冬季");
        }else if(month==1){
            System.out.println("冬季");
        }else if(month==2){
            System.out.println("冬季");
        }else {
            System.out.println("输入的数据有误，请重新输入");
        }

    }
}
