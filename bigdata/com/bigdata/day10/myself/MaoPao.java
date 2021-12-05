package com.bigdata.day10.myself;
/*
冒泡排序

 */
public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {6,3,4,8,5,4,9};
        System.out.println("排序之前：");
        for(int num:arr){
            System.out.print(num + " ");
        }
        for(int i = 0;i < arr.length-1 ;i++){
            for(int j = 0;j < arr.length-1-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

            }
        }
        System.out.println();
        System.out.println("排序后：");
        for(int unm:arr){
            System.out.print(unm + " ");
        }
    }

}
