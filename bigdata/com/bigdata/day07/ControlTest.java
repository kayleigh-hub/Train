package com.bigdata.day07;

/*
        小芳的妈妈每天给她2.5元钱，她都会存起来，但是，
        每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
        请问，经过多少天，小芳才可以存到100元钱。

        分析
            1、由于存钱是每天都会发生的事，所以我们考虑循环
                我们学过的循环有for循环和while循环
                这里由于不知道存多少天，我们推荐使用while循环
            2、存的钱的总额
               统计天数


 */
public class ControlTest {
    public static void main(String[] args) {
        //定义两个变量分别代表金额和天数
        double money = 0;
        int day = 0;

        while (money <= 100) {
            day = day + 1;
            money = money + 2.5;

            //当day是5或者是5的倍数的时候，money-6
            if (day % 5 == 0) {
                money = money - 6;
            }
            System.out.println("第" + day + "天，已经存到了" + money + "元");
        }
        System.out.println("=================================");

        System.out.println("第" + day + "天的时候，存到了" + money + "元");


    }
}
