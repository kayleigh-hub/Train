package com.bigdata.day08;

/*

        定义两个数组，分别输出数组名及元素。int类型的数组
        然后分别给数组中的元素赋值，分别再次输出数组名及元素。

 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        //定义一个数组（动态初始化的方式）
        int[] arr1 = new int[3];
        arr1[0] = 11;
        arr1[1] = 22;
        arr1[2] = 33;
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        //定义第二个数组（动态初始化的方式）
        int[] arr2 = new int[4];
        arr2[0] = 44;
        arr2[1] = 55;
        arr2[2] = 66;
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        //如果没有给数组装你太型的数据，那么系统会给一个默认的初始值。


    }
}
