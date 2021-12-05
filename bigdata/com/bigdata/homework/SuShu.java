package com.bigdata.homework;
import java.util.Scanner;
/*
        求质数:接收用户输入的数字,判断是否为质数
        质数的概念:一个大于1的自然数,除了1和它自身外,不能被其他自然数整除的数叫做质数,也称为素数
        规定:1既不是质数,也不是合数
 */
public class SuShu{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i = 2;i<= a ;i++){
            if(a % i == 0 && i != a){
                System.out.println("bushi");
                break;
            }else if(i == a){//如果i==a 说明n不能被2～n-1整除
                System.out.println("shi");
            }
        }
    }
}
//    public static void main(String[] args) {
//        // 提示输入一个数字
//        System.out.println("请输入一个大于1的整数");
//        double s = new Scanner(System.in).nextDouble();
//
//
//        SuNum(s);
//    }
//    public static void SuNum(double s){
//        if(s == 2){
//            System.out.println("是素数");
//            return;
//        }
//        if(s<2){
//            System.out.println("不是素数");
//            return;
//        }
//        boolean flag = true;
//        for(int i = 2;i<s;i++){
//            if(s % i == 0){
//                flag = false;
//            }
//        }
//        if(flag){
//            System.out.println("shi");
//        }else{
//            System.out.println("bushi");
//        }


//        boolean flag = true;
//            for(int i= 2;i<s;i++) {
//                if (s % i == 0) {
//                    flag = false;
//                    }
//                }
//                    if(flag) {
//                        System.out.println("你输入的数是素数");
//                 }else{
//                        System.out.println("你输入的数不是素数");
//                    }
////
//    }
//        public static void main(String[] args) {
//            int a = new Scanner(System.in).nextInt();
//
//            boolean flag = true;
//                 for(int i = 2;i < a;i++){
//                     if(a % i == 0){
//                        flag= false;
//
//                    }
//                }
//                    if(flag){
//                     System.out.println("shi");
//                }else {
//                        System.out.println("bushi");
//                    }
//
//        }
//}



























//        import java.util.Scanner;
//public class PrimeNumber {
//    public static void main(String[] args) {
//        System.out.print("请输入要判断的自然数：");
//        int n = new Scanner(System.in).nextInt();
////调用getPrimeNumber()方法，判断n是否为质数
//        getPrimeNumber(n);
//    }
//    public static void getPrimeNumber(int n) {
//        if(n<2) {//此范围内的数均不为质数
//            System.out.println(n+"不是质数");
//            return;//结束程序
//        }
//        if(n == 2) {
//            System.out.println("2是质数");
//            return;
//        }
////在 2到 1+n开方范围(数学理论)，找能把n整除的值(这个值也称作因子)
////如果找到可以把n整除的第三个数，那n就不是质数,反之,n为质数
//        double max = 1+ Math.sqrt(n);//max保存的是查找因子的范围
////依次遍历范围内的所有数,验证是否存在n的因子
//        for(int i=2; i<max; i++) {
////判断n能不能被i整除,如果有,说明不是质数
//            if(n%i == 0) {
//                System.out.println(n+"不是质数");
//                return;
//            }
//        }
////如果判断了范围内的所有值，没有能整除的,则说明n是质数
//        System.out.println(n+"是质数");
//    }
//}