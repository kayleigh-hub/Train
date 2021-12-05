package com.bigdata.day09;

/*
            数组获取最值(获取数组中的最大值最小值)
            1、定义一个数组，存储一些元素（使用静态初始化）
            2、首先在数组中任意找一个元素进行比较，默认一开始它就是最大值
                一般来说，我们取第一个（选择排序）
            3、遍历其他的元素与第一个元素进行比较，如果找到了更大的元素，
                就将它取代，如果比它小，不管它继续和后面比较
            4、输出最大值

 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //定义一个数组
        int[] array = {3, 2, 312, 41, 31, 324, 14, 12, 344, 1, 65, 534};
        int m = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] > m){
                m = array[i];
            }

        }
        System.out.println("kayleigh:"+ m);

        //定义一个数组（静态初始化的方式）
        int[] arr = {3, 2, 312, 41, 31, 324, 14, 12, 344, 1, 65, 534};

        //从数组取出任意一个元素进行比较（一般情况下取第一个，默认是最大值）
        int max = arr[0];

        //拿着这个元素，与其他的元素进行比较
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //输出比较结束后的最大值
        System.out.println("数组中元素的最大值为：" + max);

        //使用方法改进一下
        System.out.println("=======方法获取数组最值===========");
        int maxNum = getMaxNum(arr);
        System.out.println("数组中元素的最大值为：" + maxNum);
        int minNum = getMinNum(arr);
        System.out.println("数组中元素的最小值为：" + minNum);
        int i = getMax(array);
        System.out.println("kayleih:"+ i);
        int j = geiMin(arr);
        System.out.println("kayleigh:"+ j);
    }

    /**
     * 获取数组中的最大值
     *
     *  返回值类型：int
     *  参数：int[]
     *
     */
    public static int getMax(int[] arr){
        int m = 0;
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }
    public static int getMaxNum(int[] array){
        //从数组取出任意一个元素进行比较（一般情况下取第一个，默认是最大值）
        int max = array[0];

        //拿着这个元素，与其他的元素进行比较
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }


    /**
     * 获取数组中的最小值
     *  返回值类型：int
     *  参数列表：int[]
     *
     */
    public static int getMinNum(int[] array){
        //从数组取出任意一个元素进行比较（一般情况下取第一个，默认是最大值）
        int min = array[0];

        //拿着这个元素，与其他的元素进行比较
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }


    public static int geiMin(int[] arr){
        int n = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] < n){
                n = arr[i];
            }
        }
        return n;
    }

}
