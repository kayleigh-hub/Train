package com.bigdata.day07;

/*
    键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表

 */
import java.util.Scanner;
public class FunctionTest3 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要的nn乘法表的n的值：");
        int n = sc.nextInt();
        //调用方法，打印对应的乘法表
        printMul(n);

    }

    //定义一个方法，输出对应的乘法表
    /**
     *  返回值类型：void
     *  参数列表：一个参数，int a
     */
    public static void printMul(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
