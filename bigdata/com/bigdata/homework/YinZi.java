package com.bigdata.homework;
import java.util.Scanner;
/*
       题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
       例如6=1＋2＋3.编程找出1000以内的所有完数。
 */
public class YinZi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        yinShu(a);
    }
    public static void yinShu(int a){
        int k = 0;
        for(int i = 1;i < a; i++){
            if(a % i == 0){
                k = k + i;
                System.out.println(i);
            }
        }
    }
}
