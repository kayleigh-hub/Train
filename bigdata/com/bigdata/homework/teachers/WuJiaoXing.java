package com.bigdata.homework.teachers;

//public class WuJiaoXing {
////    public static void main(String[] args) {
////        for(int i = 1;i <= 5 ; i++){
////            for(int j = 1;j <= i; j++){
////                System.out.print("*");
////            }
////            System.out.println("");
////        }
////    }
//}


import java.util.concurrent.SynchronousQueue;
//import java.util.Scanner;
//public class WuJiaoXing {
//    public static void main(String[] args) {
//        int a = new Scanner(System.in).nextInt();
//
//        for(int i = 1; i <= a; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//    }
//}
//public class WuJiaoXing {
//    public static void main(String[] args) {
//        for(int i = 1; i <= 5; i++){
//            for(int a = 1; a <= (5-i); a++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=2*i-1;j++){
//                System.out.print("@");
//            }
//            System.out.println();
//        }
//    }
//}


public class WuJiaoXing {
    public static void main(String[] args) {
        for (int j = 1; j <= 7 ; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            for(int j = 1;j <= 6;j++){
                for(int i = 1; i <= 7-j ; i++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

}

