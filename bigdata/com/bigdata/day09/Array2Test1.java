package com.bigdata.day09;

/*
        二维数组遍历
        int[][] arr = {{1,2},{11,22,33},{100,200,300},{10,20,30,40}};

        分析：
            1、先获取每一个一维数组
            2、一次遍历每一个一维数组中的元素值
 */
public class Array2Test1 {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] arr = {{1,2},{11,22,33},{100,200,300},{10,20,30,40}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

        System.out.println(arr[3][0]);
        System.out.println(arr[3][1]);
        System.out.println(arr[3][2]);
        System.out.println(arr[3][3]);

        System.out.println("===========for循环嵌套打印二维数组=========================");

        //使用上面一个一个元素的打印确实可以将每一个元素输出
        //但是呢，当数据量特别大的时候，
        // 你怎么知道有多少个一维数组以及一维数组中有多少个元素呢？
        //按照上面的输出很有可能发生数组下标索引越界以及空指针的异常
        //我们之前学一维数组的时候，结合for循环以及数组的length属性可以对一维数组
        //进行遍历，所以，我们想一想，这个方式能不能遍历二维数组呢？
        //经过分析，发生是可以的
        //需要两个for循环，一个for循环遍历获取的是每一个一维数组
        //内部for循环遍历的是获取到的每一个一维数组中每个元素值
        for(int i=0;i<arr.length;i++){
            //针对获取到的每一个一维数组进行遍历
            for(int j=0;j<arr[i].length;j++){
                if(j==0){
                    System.out.print("二维数组中第"+(i+1)+"个一维数组：["+arr[i][j]+",");
                }else if(j==arr[i].length-1){
                    System.out.print(arr[i][j]+"]");
                }else {
                    System.out.print(arr[i][j]+",");
                }
            }
            System.out.println();
        }
        for(int i = 0;i < arr.length;i++){
            //这个for循环是控制整个行。
            for(int j = 0;j < arr[i].length; j++){
                if(j == 0){
                    System.out.print("第"+ (i+1) +"个一位数组：[" + arr[i][j]+",");
                }else if(j == arr[i].length-1){
                    System.out.print(arr[i][j] + "]");
                }else{
                    System.out.print(arr[i][j]+",");
                }
            }
            System.out.println();
        }
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr[i].length;j++){
                if(j == 0){
                    System.out.print("第"+(i+1)+"的一位数组是："+"["+arr[i][j] + ",");
                }else if(j == arr[i].length-1){
                    System.out.print(arr[i][j]+"]");
                }else {
                    System.out.print(arr[i][j]+"，");
                }
            }
            System.out.println();
        }



    }
}
