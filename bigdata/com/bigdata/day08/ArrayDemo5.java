package com.bigdata.day08;

/*
        静态初始化：初始化时指定每个数组元素的初始值，由系统决定数组长度。

        格式：
            数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
        举例：
            int[] arr = new int[]{1,2,3};
        解释：定义了一个int类型的数组，这个数组中可以存放3个int类型的值，
                并且值分别是1,2,3。
            其实这种写法还有一个简化的写法
            int[] arr = {1,2,3};


        注意事项
            1、大括号中值要和定义数组的时候数据类型要一致
            2、使用静态初始化的时候，右边的中括号中不允许出现数字
                如果出现了，就意味着，定义的时候既有动态初始化，也有静态初始化
                两者不能混淆
                int[] arr1 = new int[5]{1,2,3,4,5};//错误
            3、当初始值不是0的时候，推荐使用静态初始化




 */
public class ArrayDemo5 {
    public static void main(String[] args) {
        //静态初始化定义数组给11，22，33，44，55
        int[] arr = new int[]{11,22,33,44,55};
//        int[] arr1 = new int[5]{1,2,3,4,5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);


        //静态初始化简化版
        int[] arr2 = {100,200,300};

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        //ArrayIndexOutOfBoundsException: 3
        //数组下标索引越界异常，没有对应的索引
//        System.out.println(arr2[3]);

        arr2 = null;
        //NullPointerException 空指针异常，说明没有任何实例
//        System.out.println(arr2[0]);

    }
}
