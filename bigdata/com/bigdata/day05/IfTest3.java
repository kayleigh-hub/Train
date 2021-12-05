package com.bigdata.day05;
/*
        if语句的嵌套：
            需求：获取三个数据中的最大值

        int a = 10;
        int b = 21;
        int c = 30;

        键盘录入改进
 */
import java.util.Scanner;
public class IfTest3 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 21;
//        int c = 30;

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数据：");
        int c = sc.nextInt();

        if(b > c){
            if(b > a){
                System.out.println("最大值是b:"+b);
            }else {
                System.out.println("最大值是a:"+a);
            }
        }else {
            if(c > a){
                System.out.println("最大值是c:"+c);
            }else {
                System.out.println("最大值是a:"+a);
            }
        }

    }
}
