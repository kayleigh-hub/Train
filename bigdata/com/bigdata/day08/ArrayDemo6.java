package com.bigdata.day08;

/*
        数组遍历(依次输出数组中的每一个元素)

 */
public class ArrayDemo6 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = new int[8];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
        arr[5] = 66;
        arr[6] = 77;
        arr[7] = 88;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);

        System.out.println("======for循环改进============");
        for(int i=0;i<8;i++){
            System.out.println(arr[i]);
        }
        System.out.println("=====for循环改进2=================");
        //由于我们上面的数组arr可以一眼就能数清有多少个元素，所以在循环的时候，可以
        //确定一个范围
        //但是呢，当我们数组中的元素有非常多的时候，这时候就不一定能数清了
        //如果有一个办法可以获取数组元素的个数就好了
        //java中的数组提供一个属性，可以让我们获取到数组的长度
        //这个属性的名字叫做：length
        //使用格式：
        //  数组名称.length

        int[] arr2 = {3123,12,43,4,423,12,32,4,12,312,41,3,1,45324,23,4,3,12,3,21,412,3,21,3,21,4,21,3,213,43,5,4,554,3,432,4,2,23,4,2};
        System.out.println(arr2.length);
        for(int i=0;i<arr2.length;i++){
            if(i==arr2.length-1){
                System.out.println(arr2[i]+"]");
            }else if(i==0){
                System.out.print("["+arr2[i]+",");
            }else {
                System.out.print(arr2[i]+",");
            }

        }

        System.out.println("=====用方法改进打印arr2======================");

        printArray(arr2);
        System.out.println("=====用方法改进打印arr======================");
        printArray(arr);
    }

    /**
     *  返回值类型：void
     *  参数列表：int[]
     *
     */
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            if(i==array.length-1){
                System.out.println(array[i]+"]");
            }else if(i==0){
                System.out.print("["+array[i]+",");
            }else {
                System.out.print(array[i]+",");
            }

        }
    }

}
