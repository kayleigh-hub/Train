package com.bigdata.day06;

/*
        do...while循环
            语句格式：
                基本格式
                    do {
                        循环体语句;
                    }while(判断条件语句);

                扩展格式（开发中使用扩展格式）
                    初始化语句;
                    do {
                        循环体语句;
                        控制条件语句;
                    } while(判断条件语句);

 */
public class DoWhileDemo1 {
    public static void main(String[] args) {
        //统计1-10之和
        int sum = 0;
        int i = 1;
        do {
            sum = sum + i;
            i++;
        } while (i <= 10);

        System.out.println("1-10之和为：" + sum);
    }
}
