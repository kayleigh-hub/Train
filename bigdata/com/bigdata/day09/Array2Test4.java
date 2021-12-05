package com.bigdata.day09;

/*
        打印杨辉三角形(行数可以键盘录入)
        1
        1 1
        1 2 1
        1 3 3  1
        1 4 6  4  1
        1 5 10 10 5 1
        ...

        分析规律：
            1、任意一行的第一列和最后一列都是1
            2、从第三行开始，每个数据都是它上一行本列与上一行前一列之和

        实现步骤：
            1、首先定义一个二维数组，行数为n,键盘录入n,行数与列数是相同的，也是n
            2、首先给二维数组中的每一个一维数组的第一列和最后一列赋值1
            3、按照我们发现的规律，给其他元素进行赋值
                从第三行开始，每个数据都是它上一行本列与上一行前一列之和
            4、遍历输出这个二维数组

 */
import java.util.Scanner;
public class Array2Test4 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您想要的杨辉三角的行数n:");
        int rowNum = sc.nextInt();
        int row = sc.nextInt();

//        //定义一个二维数组
        int[][] pascalTriangle = new int[rowNum][rowNum];
//        int[][] triangle = new int[row][row];
//        for(int i = 0;i < triangle.length;i++){
//            triangle[i][0] = 1;
//            triangle[i][i] = 1;
//        }

                //给二维数组中的每一个一维数组的第一列和最后一列赋值1
        //获取到每一个一维数组，通过索引给第一个元素和最后一个元素进行赋值
        for(int i=0;i<pascalTriangle.length;i++){
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;
        }

//        for(int i = 2;i < triangle.length;i++){
//            for(int j = 0;j < i-1;j++){
//                triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
//            }
//        }
//        System.out.println("结果如下");
//        for(int i =0;i < triangle.length;i++){
//            for(int j = 0;j < triangle[i].length;j++){
//                if(j == 0){
//                    System.out.print(triangle[i][j]+ "\t");
//                }else if(triangle[i][j] == 0){
//                    continue;
//                }else if(j == triangle[i].length-1){
//                    System.out.print(triangle[i][j]);
//                }else{
//                    System.out.println(triangle[i][j] + "\t");
//                }
//            }
//            System.out.println();
//        }

//
        //按照我们发现的规律，给其他元素进行赋值
        //从第三行开始，每个数据都是它上一行本列与上一行前一列之和
        for(int i=2;i<pascalTriangle.length;i++){
            for(int j=1;j<=i-1;j++){
                pascalTriangle[i][j] = pascalTriangle[i-1][j] + pascalTriangle[i-1][j-1];
            }
        }
        System.out.println("该杨辉三角如下：");
        //遍历输出这个二维数组
        for(int i=0;i<pascalTriangle.length;i++){
            //针对获取到的每一个一维数组进行遍历
            for(int j=0;j<pascalTriangle[i].length;j++){
                if(j==0){
                    System.out.print(pascalTriangle[i][j]+"\t");
                }else if(pascalTriangle[i][j]==0){
                    continue;
                }else if(j==pascalTriangle[i].length-1){
                    System.out.print(pascalTriangle[i][j]);
                }else {
                    System.out.print(pascalTriangle[i][j]+"\t");
                }
            }
            System.out.println();
        }



    }
}
