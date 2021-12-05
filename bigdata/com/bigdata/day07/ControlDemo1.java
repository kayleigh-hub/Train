package com.bigdata.day07;

/*
        前面我们已经说过了，Java中的goto是保留字，目前不能使用。
        虽然没有goto语句可以增强程序的安全性，但是也带来很多不便，
        比如说，我想在某个循环知道到某一步的时候就结束，现在就做不了这件事情。
        为了弥补这个缺陷，
        Java就提供了break，continue和return来实现控制语句的跳转和中断。

        break,continue,return  它们都是关键字

        break: 中断，结束的意思

        break的使用场景：
        根据单独使用的时候报错信息我们得出，break语句是适用于switch语句和循环语句中
            1、在switch语句中使用
            2、在循环语句中使用
            3、单独在if语句中不能使用

 */
import java.util.Scanner;
public class ControlDemo1 {
    public static void main(String[] args) {
        //单独使用是没有任何意义的
//        break;

        //需求1：输入1-7，输出对应的星期
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入您想知道星期几的数字：（1-7）");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期日");
                    break;
                case 0:
                    flag = false;
                    System.out.println("欢迎下次使用");
                    break;
                default:
                    System.out.println("您输入的数据有误,请重新输入");
                    break;
            }
        }

        System.out.println("=======================");
        //需求2：循环打印1-10，加入break,让它在打印3的时候，结束for循环
        for(int i=1;i<=10;i++){
            System.out.println(i);
            //当打印3的时候，结束for循环
            if(i==3){
                break;
            }

        }

//        int a = 10;
//        if(a==10){
//            break;
//        }




    }
}
