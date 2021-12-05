package com.bigdata.day06;

/*
    求出1-10之间数据之和
 */
public class ForTest2 {
    public static void main(String[] args) {
        //定义一个变量接收和，初始值我们随便给，这里就给0
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
            sum = sum + i;
        }

        System.out.println("从1-10的和为：" + sum);

    }
}
