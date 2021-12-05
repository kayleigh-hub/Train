package com.bigdata.day09;

public class ArrayDemo21 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        zhiQian(arr);


        int[] a = niXu(arr);
        System.out.println("kayleigh");
        zhiQian(a);
//
//        int[] niXuResult2 = niXu(arr);
//        System.out.println("逆序之后：");//987654321
//        printArray(niXuResult2);
    }
    public static void zhiQian(int[] array){
        for(int i = 0;i < array.length;i++){
            if(i == 0){
                System.out.print("["+array[i]+",");
            }else if(i == array.length-1){
                System.out.print(array[i]+"]");
            }else{
                System.out.print(array[i]+",");
            }
        }
        System.out.println();
    }




    public static int[] niXu(int[] array){
        for(int i = 0;i < array.length/2; i++){
            int tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
        return array;
    }
    //        //用for循环实现交换
//        for(int i=0;i<array.length/2;i++){
//            int temp = array[i];
//            array[i] = array[array.length-1-i];
//            array[array.length-1-i] = temp;
//        }
//        return array;

}
