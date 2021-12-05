package com.bigdata.day07;

/*
            键盘录入行数和列数，输出对应的星形
            定义方法，实现输出对应几行几列的星形

            定义方法需要考虑的问题：
                1、方法需不需要返回值？
                2、方法的参数是哪些？

 */
import java.util.Scanner;
public class FunctionTest2 {
    public static void main(String[] args) {

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数：");
        int row = sc.nextInt();
        System.out.println("请输入列数：");
        int col = sc.nextInt();

        //调用方法，打印星形
        printStar(row,col);
    }

    //定义方法，实现输出对应几行几列的星形
    /**
     *  返回值类型：void
     *  参数列表：两个参数，分别代表行和列 int row,int col
     *
     */
    public static void printStar(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }


}
