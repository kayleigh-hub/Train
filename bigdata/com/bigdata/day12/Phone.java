package com.bigdata.day12;

/*
        标准类代码3.0版本，一个标准的手机类
        分析：
            手机：
                属性：品牌，颜色，价格
                行为：打电话，发短信，学习
            类：
                成员变量：brand,color,price（使用private修饰）
                构造方法：无参构造方法，带参构造方法
                成员方法：setXxx()和getXxx()方法
                show():输出所有的成员变量


 */
public class Phone {
    //定义成员变量
    private String brand;
    private String color;
    private int price;

    //定义构造方法
    Phone() {

    }

    Phone(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    //定义公共的setXxx()和getXxx()
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    //定义一个可以输出所有成员变量的方法
    public void show() {
        System.out.println("品牌：" + brand + ",颜色：" + color + ",价格：" + price);
    }
}
