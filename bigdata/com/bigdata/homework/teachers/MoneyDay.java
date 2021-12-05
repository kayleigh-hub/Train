package com.bigdata.homework.teachers;

public class MoneyDay {
    public static void main(String[] args) {
        double money = 0;
        int day = 0;
        while(money <= 100){
            day++;
            money+=2.5;
            if(day ==5 || day % 5 ==0){
                money = money - 6;
            }
            System.out.println(money);
        }
    }
}
