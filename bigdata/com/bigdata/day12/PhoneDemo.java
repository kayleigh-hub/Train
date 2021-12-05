package com.bigdata.day12;

/*
        手机测试类：
            开发中最常用的是第二种方式，单个使用永远要比混合使用要灵活

 */
public class  PhoneDemo {
    public static void main(String[] args) {
        //使用无参的构造方法创建对象，并使用setXxx()给成员变量进行赋值
        System.out.println("=======使用无参的构造方法创建对象，并使用setXxx()给成员变量进行赋值=======");
        Phone p1 = new Phone();
        System.out.println("未赋值前：");
        p1.show();
        p1.setBrand("华为");
        p1.setColor("黑色");
        p1.setPrice(4999);
        System.out.println("赋值后：");
        p1.show();
        System.out.println("================================================");
        System.out.println("=======使用带参数的构造方法创建对象，并使用getXxx()获取成员变量=======");
        Phone p2 = new Phone("锤子手机","白色",8888);
        String brand = p2.getBrand();
        String color = p2.getColor();
        int price = p2.getPrice();
        System.out.println("品牌["+brand+"]\t颜色["+color+"]\t价格["+price+"]");


    }
}
