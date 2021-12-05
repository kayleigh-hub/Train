package com.bigdata.day08;

/*
        数组：
            1、数组是存储同一数据类型的多个元素的集合，暂时理解为一个容器
            2、数组既可以存储基本数据类型，也可以存储引用数据类型

        语句格式：
            格式1：数据类型[] 数组名;
                举例：int[] arr1
            格式2：数据类型 数组名[];
                举例：double arr2[]
            注意：这两种定义做完了，数组中是没有元素值的。
            针对于这两种定义数组的格式，推荐使用第一种，因为第一种的定义格式
            可读性更强。早期的时候很多人喜欢用第二种，但是慢慢地发展，使用第一种的人越来越多了
            如果说只是简单地定义了一个数组，但是呢，数组里面却没有值，没有任何意义。
            所以要想使用它，就必须先做初始化。
            什么叫初始化？
                就是为数组中地元素进行分配内存空间，并且为元素赋值。
            如何对数组的元素进行初始化呢?
                1、动态初始化：初始化时只指定数组长度，由系统为数组分配初始值。
                    先不赋值
                2、静态初始化：初始化时指定每个数组元素的初始值，由系统决定数组长度。
                    先赋值

            动态初始化：初始化时只指定数组长度，由系统为数组分配初始值。
                格式：数据类型[] 数组名 = new 数据类型[数组长度];
                数组长度其实就是数组中元素的个数。
                举例：
                int[] arr = new int[3];
                解释：定义了一个int类型的数组，这个数组中可以存放3个int类型的值。






 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义一个数组，int类型地数组
//        int[] arr;
        //单独使用是没有任何意义地，因为尚未初始化变量arr，未初始化之前不能使用
//        System.out.println(arr);

        //动态初始化的方式定义一个int类型的数组,长度为3
        int[] arr = new int[3];
        /**
         *    左边：
         *      int: 说明数组中的元素的数据类型是int类型
         *      []: 说明它是一个数组类型
         *      arr: 给数组起个名字
         *
         *    右边：
         *      new: 代表为数组分配一个内存空间
         *      int: 说明数组中的元素的数据类型是int类型
         *      []: 说明它是一个数组
         *      3: 代表着数组的长度，其实这里的3就是数组元素的个数
         *
         *   学生[] 十四期 = new 学生[50];
         *
         */

        System.out.println(arr); //[I@4554617c 地址值 十六进制的
        //但是呢，在实际编写代码的过程中，拿到地址值是没有任何意义的，我们大多数情况下
        //实际上是想获取数组的元素值，怎么获取呢？
        //数组里面提供了一个类似于编号的作用的东西，我们称之为索引（下标）
        //如何通过索引获取数组中的元素呢？
        //语法格式：
        //      数组的名称[索引]
        //注意：索引的编号是从0开始的，从左往右的顺序编号。

        //获取arr数组中的第一个元素
        System.out.println(arr[0]);
        //获取arr数组中的第二个元素
        System.out.println(arr[1]);
        //获取arr数组中的第三个元素
        System.out.println(arr[2]);




    }
}