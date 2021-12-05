package com.bigdata.day10;

public class phoneDemo{
    public static void main(String[] args) {
        phone s1 = new phone();

        s1.color = "黄色";
        s1.brand = "香蕉";
        s1.price = 4999;
        System.out.println(s1.color + s1.brand + s1.price);
        s1.call("你好");
        s1.read("黄");
    }
}