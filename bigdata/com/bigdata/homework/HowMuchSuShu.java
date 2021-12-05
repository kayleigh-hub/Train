package com.bigdata.homework;
/*
        接收用户输入的数字,判断在此范围内质数的个数
 */
import java.util.Scanner;

public class HowMuchSuShu {
    public static void main(String[] args) {
        //请输入一个数，来判断这个范围内有多少个素数
        double a = new Scanner(System.in).nextDouble();
        //double b = new Scanner(System.in).nextDouble();

        //调用判断方法
        HowMany(a);
    }
    public static void HowMany(double a){

        if(a < 2){
            System.out.println("不是素数");
        }
        if(a == 2){
            System.out.println("是素数");
        }
        //定义一个计数的变量，c
        int c = 1;
        outer:

        for(int i = 3;i <= a; i++ ){
            //这里是判断i是否为素数
            double max = 1 + Math.sqrt(i);
            for(int j = 2; j <= max; j++){
                if(i % j == 0){
                    //i%j的值是0，所以这里的i，不是素数
                    continue outer;
                }
            }c++;
        }System.out.println("你输入的数中，素数的个数为：" + c);
    }
}
//a:
//for(i= 3;i<=a;i++){
//    double max = Math.Sqrt(i) + 1;
//    for(int j = 2 ;j<= max ;j++){
//        if(i%j==0){
//            continue a;
//        }
//        }
//    int c=0;
//    }