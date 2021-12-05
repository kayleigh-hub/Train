package com.bigdata.day08.train;
import java.util.Random;
/*
            这是一道矩阵的编程实现题。
            Java中矩阵一般都是通过二维数组实现的。
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        int sum = 0; //和
        int[][] arr = new int[3][3];
        Random r = new Random();
        for(int i=0;i<3;i++){    //随机生成矩阵
            for(int j=0;j<3;j++){
                arr[i][j] = r.nextInt(10);  //0到9
            }
        }
        for(int i=0;i<3;i++){      //遍历矩阵
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");   //打印矩阵元素
                if(i==j){   //如果为对角线元素
                    sum += arr[i][j];  //求和
                }
            }
            System.out.println(); //每输出3个元素换行
        }
        System.out.println("此矩阵对角线的和为:"+sum);
    }
}
