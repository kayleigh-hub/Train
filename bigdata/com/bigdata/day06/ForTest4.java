package com.bigdata.day06;

/*
    求5的阶乘
    阶乘：
        2！= 1 * 2
        3！= 1 * 2 * 3
        4！= 1 * 2 * 3 * 4
        5！= 1 * 2 * 3 * 4 * 5
 */
public class ForTest4 {
    public static void main(String[] args) {

        int result = 1;
        for (int i = 2; i <= 5; i++) {
//            System.out.println(i);
            result = result * i;
        }
        System.out.println("5的阶乘为：" + result);
    }
}
