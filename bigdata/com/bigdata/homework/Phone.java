package com.bigdata.homework;

public class Phone {
    private String brand;
    private String color;
    private int price;

    Phone(){

    }

    Phone(String brand,String color,int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    public void setBrand(String brand){ this.brand= brand; }
    public String getBrand(){ return brand; }

    public void setColor(String color){ this.color = color; }
    public String getColor(){ return color; }

    public void setPrice(int price){ this.price = price;}
    public int getPrice(){ return price;}

    public void show(){
        System.out.println("颜色" + color + ",品牌" + brand + ",价格" + price);
    }
}

class phonedemo{
    public static void main(String[] args) {
        Phone s1 = new Phone("小米","红色",4999);
        String brand = s1.getBrand();
        String color = s1.getColor();
        int price = s1.getPrice();
        System.out.println(brand+color+price);


        Phone s2 = new Phone();
        s2.show();
        s2.setBrand("huawei");
        s2.setColor("red");
        s2.setPrice(5999);
        s2.show();


    }
}