package com.bigdata.day05;

/*
        位运算符：是直接对二进制参与运算的
            <<,>>,>>>,&,|,^,~
 */
public class OptWeiDemo1 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        System.out.println(x & y); //0
        System.out.println(x | y); //7
        System.out.println(x ^ y); //7
        System.out.println(~x); //-4
    }
}

