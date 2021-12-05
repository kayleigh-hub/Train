package com.bigdata.day09;

/*
        公司年销售额求和
        某公司按照季度和月份统计的数据如下：单位(万元)
            第一季度：22,66,44
            第二季度：77,33,88
            第三季度：25,45,65
            第四季度：11,66,99

       键盘录入每个月的销售额，按照季度去输入

 */

import java.util.Scanner;

public class Array2Test2 {
    public static void main(String[] args) {
        //定义一个二维数组将数据存起来
        int[][] saleArray = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};

        //定义一个变量接收总销售额
        int sumSale = 0;
        for (int i = 0; i < saleArray.length; i++) {
            for (int j = 0; j < saleArray[i].length; j++) {
                sumSale += saleArray[i][j];
            }
        }

//        int sumArray = 0;
//        int[][] arraySale = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
//        for(int i = 0;i < arraySale.length;i++){
//            for(int j = 0;j < arraySale[i].length;j++){
//                sumArray += arraySale[i][j];
//            }
//        }
//        System.out.println("keyleigh:" + sumArray );

        System.out.println("该公司一年的销售额为：" + sumSale + "万元。");
        System.out.println("=========keyleigh的键盘录入每个月的销售额，按照季度去输入========");

        Scanner sc = new Scanner(System.in);
        int[][] arrSale2 = new int[4][3];
        for(int i = 0;i < arrSale2.length;i++){
            for(int j = 0;j < arrSale2[i].length;j++){
                System.out.println("请输入第"+(i+1)+"季度第"+(j+1)+"月的营业额");
                int a = sc.nextInt();
                arrSale2[i][j] = a;
            }
            System.out.println("录入完毕");
        }
        int a = 0;
        for(int i = 0;i < arrSale2.length;i++){
            for(int j = 0;j < arrSale2[i].length;j++){

                a += arrSale2[i][j];
            }
        }
        System.out.println("kayleigh"+ a);
        System.out.println("=========kayleigh写的结尾========");
        System.out.println("=========键盘录入每个月的销售额，按照季度去输入========");
        //创建键盘录入对象
        //Scanner sc = new Scanner(System.in);
        //定义一个二维数组
        int[][] saleArray2 = new int[4][3];
        for (int i = 0; i < saleArray2.length; i++) {
            for (int j = 0; j < saleArray2[i].length; j++) {
                System.out.print("请输入第" + (i + 1) + "季度的第" + (j + 1) + "月的销售额：");
                int saleNum = sc.nextInt();
                saleArray2[i][j] = saleNum;
            }
            System.out.println("第" + (i + 1) + "季度的销售额录入完毕！");
        }

        int sumSale1 = 0;
        for (int i = 0; i < saleArray2.length; i++) {
            for (int j = 0; j < saleArray2[i].length; j++) {
                sumSale1 += saleArray2[i][j];
            }
        }
        System.out.println("该公司一年的销售额为：" + sumSale1 + "万元。");


    }
}
