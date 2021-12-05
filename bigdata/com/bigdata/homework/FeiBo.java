package com.bigdata.homework;
/*
        题目:古典问题:有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月
        又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少?

 */


//public class FeiBo {
//    public static void main(String[] args) {
//        int month = 1;
//        int t1 = 1;
//        int all;
//        int t2 = 1;
//        System.out.println("第一第二个月1对兔子");
//        for(int i = 3 ;i <= 24; i++){
//            t2 = t1 + t2;
//            all = t2 ;
//            t1 = all;
//            System.out.println(t2);
//        }
//    }
//}


//利用递归思想
//import java.util.Scanner;
////
//public class FeiBo{
//    public static void main(String[] args) {
//        int n = new Scanner(System.in).nextInt();
//        for(int i = 1;i <= 20;i++){
//            System.out.println(Fibonacci(i) + "\t");
//
//        }
//        Fibonacci(n);
//    }
//        public static int Fibonacci(int n) {
//            if(n == 0) {
//                return 0;
//            }
//            if(n == 1) {
//                return 1;
//            }
//            return Fibonacci(n-1) + Fibonacci(n-2);
//        }
//}

//import java.util.Scanner;
//public class FeiBo{
//    public static void main(String[] args) {
//        int n = new Scanner(System.in).nextInt();
//        for (int i = 1; i <= n ; i++){
//            System.out.println(Fiboincci(i));
//        }
//        Fiboincci(n);
//    }
//    public static int Fiboincci(int n){
//        if(n == 0){
//            return 0;
//        }
//        if(n == 1){
//            return 1 ;
//        }
//        return Fiboincci(n-1) + Fiboincci(n-2);
//    }
//}
//import java.util.Scanner;

//public class FeiBo{
//    public static void main(String[] args) {
//        int a = new Scanner(System.in).nextInt();
//
//        for(int i = a ; i <= a ;i++) {
//            System.out.println(Fiboincci(i));
//        }
//        Fiboincci(a);
//    }
//    public static int Fiboincci(int a){
//        if(a == 0){
//            return 0;
//        }
//        if (a == 1){
//            return 1;
//        }
//        return Fiboincci(a-1) + Fiboincci(a-2);
//    }
//}
//数组法
public class FeiBo{
    public static void main(String[] args) {
//        int arr[] = new int[24];
//        arr[0] = arr[1] = 1;
//        for(int i = 2;i < arr.length; i++){
//            arr[i] = arr[ i-1 ] +arr[ i-2 ];
//        }
//        System.out.println("24个月：");
//        for(int j = 0;j <= arr.length; j ++){
//            System.out.println(arr[j]);
//        }

        int[] arr1 = new int[24];
        arr1[0] = arr1[1] = 1;
        for(int i = 2 ; i < arr1.length;i++){
            arr1[i] = arr1[i-1] + arr1[i-2];

        }
        for(int j = 0;j< arr1.length;j++){
            System.out.println(arr1[j]);
        }

    }
}


//public class FeiBo {
//    public static void main(String[] args) {
//        int arr[] = new int[24];
//        arr[0] = arr[1] = 1;
//        for(int i = 2;i < arr.length; i++){
//            arr[i] = arr[i-1] +arr[i-2];

//        }
//        System.out.println("分别是：");
//        for(int j =0 ;j <= arr.length;j++){
//            System.out.println(arr[j]);
//        }
//    }
//}












