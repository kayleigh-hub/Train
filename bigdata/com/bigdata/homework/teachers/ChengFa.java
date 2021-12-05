package com.bigdata.homework.teachers;
import java.util.Scanner;
public class ChengFa {
//    public static void main(String[] args) {
//        for(int i = 1; i <=9 ; i++){
//            for(int j = 1;j<=i ; j++){
//                System.out.print(i+"*" + j +"=" + i*j + " ");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        if(a == 2){
            System.out.println("yes");

        }
        if(a<2){
            System.out.println("no");
        }
        for(int i = 3;i < a ;i++){
            if( a % i == 0){
                System.out.println("no");
                return;
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
