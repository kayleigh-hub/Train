package com.bigdata.homework;

public class Static {
    int a = 20;
    static int b = 10;
}

class StaticDemo{
    public static void main(String[] args) {
        //直接通过类名调用
        System.out.println(Static.b);

        Static s1 = new Static();
        System.out.println(s1.a);
    }
}
