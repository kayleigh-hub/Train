package com.bigdata.homework;
import java.util.Scanner;
//
//import com.sun.java.util.jar.pack.Package;
//
public class DiGui{
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        //System.out.println();
        recursion_display(n);
    }
    /*
 关于 递归中 递进和回归的理解*/
    public static void recursion_display(int n) {
        int temp=n;//保证前后打印的值一样
        System.out.print("递进:" + temp);
        if (n > 0) {
            recursion_display(--n);
        }
        System.out.print("回归:" + temp);
    }
}

//public static void main(String[] args){
//        com.sun.java.util.jar.pack.Package.File file = new File("/Users/kayleigh/Desktop/document");
//        listAllFile(file);
//    }
//    public static void listAllFile(File file){
//        File[] strs = file.listFiles();
//        for(int i = o; i < strs.length; i++){
//            //判断strs[i]是不是目录
//            if (strs[i].isDirectory()){
//                listAllFile(strs[i]);//调用自己
//                System.out.println("目录="+strs[i].getName());
//            }else{
//                System.out.println("文件名="+strs[i].getName());
//            }
//        }
//    }
//}
//
////    求数字阶乘(递归解法版)
////需求:接收用户输入的数字,计算该数字的阶乘结果
////        已知:负数不可以有阶乘,0的阶乘结果是1,
////        5 ! = 5 x 4 x 3 x 2 x 1
////        package cn.tedu.design;
//////需求:求用户输入数字的阶乘结果
//////f(int n)--用来求阶乘
//////规律：
//////f(n)= n*f(n-1)
//////f(5)= 5*4*3*2*1 = 5*f(4)
//////f(4)= 4*3*2*1 = 4*f(3)
//////f(3)= 3*2*1 = 3*f(2)
//////f(2)= 2*1 = 2*f(1)
//////f(1)= 1
//////
//////5!=5*4*3*2*1=120
//////4!=4*3*2*1
//////3!=3*2*1
//////2!=2*1
//////1!=1
////public class TestRecursion {
////    public static void main(String[] args) {
////        int result = f(15);//调用f()用来求阶乘
////        System.out.println(result);
////    }
////    /**递归的两要素 1.总结规律 2.最简问题*/
////    public static int f(int n) {
////        if(n == 1) {//最简问题
////            return 1;
////        }else {//其他情况 n*f(n-1)
//////递归:再方法内部自己调用自己
////            return n*f(n-1);
////        }
////    }
////}
