package com.bigdata.dayy11;

public class Phone2 {
    //定义成员变量
    String brand;
    String color;
    int price;

    //定义成员方法
    public void call(String s){
        System.out.println("给"+s+"打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void study(){
        System.out.println("学习");
    }
}

class PhoneDemo2{
    public static void main(String[] args) {
        //创建第一个手机对象
        Phone2 p1 = new Phone2();
        //给成员变量进行赋值
        p1.brand = "小米";
        p1.color = "陶瓷黑";
        p1.price = 4999;
        System.out.println(p1.brand+"--"+p1.color+"--"+p1.price);
        //访问成员方法
        p1.call("朱佳乐");
        p1.sendMessage();
        p1.study();

        //创建第二个手机对象
        Phone2 p2 = new Phone2();
        p2.brand = "苹果";
        p2.color = "黑色";
        p2.price = 14000;
        System.out.println(p2.brand+"--"+p2.color+"--"+p2.price);
        //访问成员方法
        p2.call("杨旭");
        p2.sendMessage();
        p2.study();





    }
}
