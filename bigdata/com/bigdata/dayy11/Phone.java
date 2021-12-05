package com.bigdata.dayy11;

/*
        手机：
            属性：品牌，颜色，价格
            行为：打电话，发短信，学习

        Phone：
            成员变量：brand,color,price
            成员方法：call,sendMessage,study
 */
public class Phone {
    //定义成员变量
    String brand;
    String color;
    int price;

    //定义成员方法
    //打电话
    public void call(String s) {
        System.out.println("给" + s + "打电话");
    }

    //发短信
    public void sendMessage() {
        System.out.println("群发短信");
    }

    //学习
    public void study() {
        System.out.println("学习");
    }
}


class PhoneDemo {
    public static void main(String[] args) {
        //通过手机类创建一个手机对象
        Phone p1 = new Phone();
        //访问成员变量
        System.out.println("品牌：" + p1.brand + ",颜色：" + p1.color + ",价格：" + p1.price);
        //手动给成员变量进行赋值操作
        p1.brand = "华为";
        p1.color = "黑色";
        p1.price = 2999;
        System.out.println("品牌：" + p1.brand + ",颜色：" + p1.color + ",价格：" + p1.price);

        //访问成员方法
        p1.call("杨老板");
        p1.sendMessage();
        p1.study();
    }
}










