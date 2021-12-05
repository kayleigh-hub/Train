package com.bigdata.day10.teacher;

/*
        看程序写结果：
 */
public class SiKaoTiDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:" + a + ",b:" + b); //a:10,20:20
        change(a, b);
        System.out.println("a:" + a + ",b:" + b); //a: ?   ,b: ?

        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(arr[1]); // ?
    }

    public static void change(int x1, int x2) { // a=10,b=20
        System.out.println("x1:" + x1 + ",x2:" + x1); //a:10,20:20
        x1 = x2; // a:20;
        x2 = x1 + x2; // b=20+20=40
        System.out.println("x1:" + x1 + ",x2:" + x2); //a:20,b:40
    }

    public static void change(int[] array) { //{1,4,3,8,5}
        for (int x = 0; x < array.length; x++) {
            if (array[x] % 2 == 0) {
                array[x] *= 2;
            }
        }
    }

}
