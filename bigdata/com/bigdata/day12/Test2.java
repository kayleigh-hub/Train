package com.bigdata.day12;

/*
        定义一个长方形类,定义 求周长和面积的方法，
        然后定义一个测试了Test2，进行测试。

        长方形周长：（长+宽）* 2
        长方形的面积：长 * 宽

 */

class Rectangle {
    private int length;
    private int width;

    Rectangle() {

    }

    Rectangle(int length, int width) {
        if (length > width) {
            this.length = length;
            this.width = width;
        } else {
            this.length = width;
            this.width = length;
        }


    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getPerimeter() {
        return (length + width) * 2;
    }

    public int getArea() {
        return length * width;
    }

}


public class Test2 {
    public static void main(String[] args) {
        //使用带参数的构造方法创建对象
        Rectangle r1 = new Rectangle(10, 20);
        System.out.println("长方形的长为：" + r1.getLength());
        System.out.println("长方形的宽为：" + r1.getWidth());
        System.out.println("长方形的面积为：" + r1.getArea());
        System.out.println("长方形的周长为：" + r1.getPerimeter());


    }
}
