package com.bigdata.day06;

/*
        偶数：能被2整除的数，叫做偶数
        奇数：不能被2整除的数，叫奇数
        需求1：求出1-100之间偶数和

        需求2：求出1-100之间奇数和

 */

public class ForTest3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
            //判断是否是偶数，与2进行取模，看看余数是不是等于0
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("1-100的偶数之和为：" + sum);


        sum = 0;
        for (int i = 1; i <= 100; i++) {
            //判断是否是奇数，与2进行取模，看看余数是不是等于1
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        System.out.println("1-100的奇数之和为：" + sum);
    }
}
