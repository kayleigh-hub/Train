package com.bigdata.day06;

/*
        请在控制台输出数据10-1
 */
public class ForTest1 {
    public static void main(String[] args) {
        int sum = 1;
        for(int i=5;i>0;i--){

            sum = sum * i;

        }
        System.out.println("总："+sum);
    }
}
