package com.bigdata.day05;

/*
        <<,>>,>>>

        <<左移: 左边最高位丢掉，右边用0补齐
        >>: 右移后最高位如果是0，用0补齐，如果最高位是1，用1补齐
        >>>: 无论最高位是0还是1，都用0补齐




 */
public class OptWeiDemo2 {
    public static void main(String[] args) {
        //规律 左移n位，数值乘上2的n次方
        System.out.println(3 << 2); //12 3*4=12 3*2^2
        System.out.println(3 << 4); //3*2^4 =48
        System.out.println(24 >> 2); //6 24/4=6 24/2^2=6
        //规律  右移n位，数值除以2的n次方
        System.out.println(48 >> 3); //48/2^3=6
        System.out.println(24 >>> 2);

        System.out.println(-24 >> 2);
        System.out.println(-24 >>> 2);

    }
}
