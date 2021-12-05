package com.bigdata.homework;
import java.util.Scanner;
/*
        手机选号:根据用户输入的手机号来确认用户实际支付的价格
        如果尾数为8，需支付办卡费50元
        如果尾数为4，需支付办卡费用0元
        如果是其他尾号,需支付办卡费用20元
 */
public class ChooseNum {
    public static void main(String[] args) {
        //提示输入并且接收手机号码
        System.out.println("请输入您预选的手机号");
        String tel = new Scanner(System.in).nextLine();//注意，String数据一般用nextLine()
        //调用getprice()方法，来计算价格，注意需要把手机号码作为方法的参数传到方法中去
        getPrince(tel);
    }
    //这个方法是为了实现题目要求的
    public static void getPrince(String tel){
        //手机号码一般是十一位的,判断号码是否输错
        if(tel.length() != 11){
            System.out.println("你的电话号码格式不正确，请重新输入");
            return;
        }
        //获取电话号码的最后一位,由于下标是从0开始的，所以第11位手机号码的下标是10
        char c = tel.charAt(10);
        //charAt(int index)方法是一个能够用来检索特定索引下的字符的String实例的方法。
        // charAt()方法返回指定索引位置的char值。索引范围为0~length()-1.
        // 如: str.charAt(0)检索str中的第一个字符,str.charAt(str.length()-1)检索最后一个字符。
        int price = 0;
        switch(c){
            case 8 : price = 50 ;
            break;
            case 4 : price = 0;
            break;
            default : price = 20 ;
        }
        System.out.println("你实际需要支付的价格：" + price);
    }

}
