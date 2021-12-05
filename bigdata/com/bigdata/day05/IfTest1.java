package com.bigdata.day05;


/*
        x和y的关系满足如下：
	            x>=3	 y = 2x + 1;
	            -1<=x<3	 y = 2x;
	            x<=-1	 y = 2x - 1;

	    键盘录入x的值，判断x的范围，执行不同的公式

	    分析：
	        1、导包
	        2、创建键盘录入对象
	        3、用变量x接收键盘录入的int类型的数据
	        4、if语句判断执行不同的路径
	        5、输出

 */

import java.util.Scanner;

public class IfTest1 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //键盘录入数据
        System.out.println("请输入x的值：");
        int number = sc.nextInt();
        int y = 0;

        if (number >= 3) {
            y = 2 * number + 1;
        } else if (number >= -1 & number < 3) {
            y = 2 * number;
        } else if (number <= -1) {
            y = 2 * number - 1;
        } else {
            System.out.println("输入的数据有误");
        }

        System.out.println("y的值为：" + y);


    }
}
