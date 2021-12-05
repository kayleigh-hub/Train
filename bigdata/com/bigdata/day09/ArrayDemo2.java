package com.bigdata.day09;

/*
        数组元素逆序 (就是把元素对调)
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9};

        //将第0索引位置的元素与length-1索引位置的元素进行交换位置
        //将第1索引位置的元素与length-1-1索引位置的元素进行交换位置
        //将第2索引位置的元素与length-1-2索引位置的元素进行交换位置
        //直到length/2
        //此时就停止交换


        //将第0索引位置的元素与length-1索引位置的元素进行交换位置
//        int temp = arr[0];
//        arr[0] = arr[arr.length-1];
//        arr[arr.length-1] = temp;
//
//        //将第1索引位置的元素与length-1-1索引位置的元素进行交换位置
//        int temp1 = arr[1];
//        arr[1] = arr[arr.length-1-1];
//        arr[arr.length-1-1] = temp;
//
//        //将第2索引位置的元素与length-1-2索引位置的元素进行交换位置
//        int temp2 = arr[2];
//        arr[2] = arr[arr.length-1-2];
//        arr[arr.length-1-2] = temp;

        System.out.println("逆序之前："); //123456789
        printArray(arr);

        //逆序
        int[] niXuResult2 = niXu(arr);
        System.out.println("逆序之后：");//987654321
        printArray(niXuResult2);
//
//        int[] niXuResult = niXu2(arr);
//        printArray(niXuResult);


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
//        for(int i = 0;i < array.length;i++){
//            if(i == 0){
//                System.out.print("["+array[i]+",");
//            }else if (i == array.length-1){
//                System.out.print(array[i]+"]");
//            }else{
//                System.out.print(array[i]+",");
//            }
//
//        }
    }



    /**
     * 实现数组的逆序
     *  返回值类型：int[]
     *  参数列表：int[]
     *
     */
    public static int[] niXu(int[] array){
//        //用for循环实现交换
//        for(int i=0;i<array.length/2;i++){
//            int temp = array[i];
//            array[i] = array[array.length-1-i];
//            array[array.length-1-i] = temp;
//        }
//        return array;
        for(int i = 0;i < array.length/2 ;i++){
            int tmp = array[i];
            array[i] = array[array.length-1];
            array[array.length-1-i] = tmp;

        }
        return array;
    }

    /**
     * 使用两个指针实现数组的逆序
     *  返回值类型：int[]
     *  参数列表：int[]
     *
     */
//    public static int[] niXu2(int[] array){
//        //使用两个指针实现
//        for(int start=0,end=array.length-1;start<=end;start++,end--){
//            int temp = array[start];
//            array[start] = array[end];
//            array[end] = temp;
//        }
//        return array;
//
//
//    }

}
