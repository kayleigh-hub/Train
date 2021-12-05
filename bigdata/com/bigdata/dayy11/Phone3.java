package com.bigdata.dayy11;

public class Phone3 {
    //定义成员变量
    String brand;
    String color;
    int price;

    //定义成员方法
    public void call(String s) {
        System.out.println("给" + s + "打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }

    public void study() {
        System.out.println("学习");
    }
}

class PhoneDemo3 {
    public static void main(String[] args) {
        /*
                创建两个手机对象 p1 p2,将p1 赋值给p2
         */
        //创建第一个手机对象
        Phone3 p1 = new Phone3();
        //给成员变量进行赋值
        p1.brand = "诺基亚";
        p1.color = "白色";
        p1.price = 299;
        System.out.println(p1.brand + "--" + p1.color + "--" + p1.price);
        p1.call("贝贝");
        p1.sendMessage();
        p1.study();

        //创建第二个手机，并且将p1赋值给p2,然后修改p2的成员变量值
        Phone3 p2 = p1;
        p2.price = 3999;
        System.out.println(p1.price);
        System.out.println(p2.price);
    }
}
