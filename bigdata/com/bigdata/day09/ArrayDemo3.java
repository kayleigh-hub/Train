package com.bigdata.day09;

/*
        数组查表法(根据键盘录入索引,查找对应星期)

        分析：
            1、创建数组，存储星期一到星期日的7个元素
            2、键盘录入1-7某个数字
            3、输出对应的星期
 */
import java.util.Scanner;
public class ArrayDemo3 {
    public static void main(String[] args) {
        //定义数组
        String[] week = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("请输入1-7中某一数字：");
            int number = sc.nextInt();
            if(1<=number & number<=7){
                System.out.println("对应的星期是："+week[number-1]);

            }else if(number==0){
                System.out.println("结束输入");
                break;
            }else {
                System.out.println("您输入的数有误，请重新输入。");
            }
        }
//        String[] weekend = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
//        while(true){
//            int a = sc.nextInt();
//            if(1 <= a && a <= 7){
//                System.out.println(weekend[a-1]);
//            }else if(a == 0){
//                break;
//            }else {
//                System.out.println("输入有误");
//            }
//        }

    }



}
