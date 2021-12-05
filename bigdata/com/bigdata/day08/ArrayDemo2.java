package com.bigdata.day08;

/*
        我们经过上一节课的讲解，我们知道了如何定义一个数组，以及如何获取数组
        中的每个元素。但是，此时数组中的元素的值是系统默认给的值，大多数情况下
        我们定义一个数组，实际上想存的是我们自己给的值
        如何将我们想给的值赋值给数组中的元素呢？
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //动态初始化定义一个数组，元素是int类型的，元素个数为3个
        //int[] arr = new int[3];
        int[] arr = new int[3];
        //定义完数组后，输出数组的名字和各个元素值
        System.out.println(arr);
        //输出数组中每个元素的值
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //需求：想要把10，20，30这个三个值分别赋值给数组中的第一个元素，第二个元素
        //第三个元素
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        //再打印数组的名字以及数组中的元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
