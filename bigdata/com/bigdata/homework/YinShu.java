package com.bigdata.homework;
    /*
            题目:将一个正整数分解质因数。例如:输入90，打印出90=2*3*3*5。
            程序分析:对n进行分解质因数，应先找到一一个最小的质数k，然后按下述步骤完成:
          (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
          (2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商，作为新的正整数n,重复执行第一步。
          (3)如果n不能被k整除，则用k+1作为k的值，重复执行第一步。
     */


import java.util.Scanner;

public class YinShu {
    public static void main(String[] args) {
        int a = 50;
        int k = 2;
        while(k <= a){
            if(k == a){
                System.out.println(a);
                break;
            }else if(a % k == 0){
                System.out.print(+k+"*");
                a = a / k;
            }
            else k++;
        }
    }
//    public static void main(String[] args) {
//        int a = new Scanner(System.in).nextInt();
//        int i = 2;
//       while(i <= a){
//            if(i == a){
//                System.out.println(a);
//                break;
//            }
//             else if(a % i == 0){
//                System.out.print(i+"*");
//                a = a/i;
//            }
//            else i++;
//        }
//    }
}






















//import java.util.*;
//public
//class
//lianxi04{
//public static void main(String[] args) {
//Scanner s = new Scanner(System.in);
//System.out.print( "请键入一一个正整数: ");
//int n = s.nextInt();
//int k=2;
//System.out.print(n +"=" );
//while(k<= n) {
//if(k == n) {System.out.println(n);break;}
//else if( n %k == 0) {System.out.print(k + "*");n=n/k; }
//else
//k++;
//}