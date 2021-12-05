package com.bigdata.day08.train;

public class ArrayTrain {
    public static void main(String[] args) {
        int[] arr = new int[8];

        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
        arr[5] = 66;
        arr[6] = 77;
        arr[7] = 88;

        int[] arr1 = new int[10];
        arr1[0] = 11;
        arr1[1] = 22;
        arr1[2] = 33;
        arr1[3] = 44;
        arr1[4] = 55;
        arr1[5] = 66;
        arr1[6] = 77;
        arr1[7] = 88;
        arr1[8] = 99;
        arr1[9] = 100;

        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("=====================这是一个分割线=========================");
        for(int i = 0;i < arr.length;i++){
            if(i == (arr.length-1)){
                System.out.println(arr[i]+ " ]" + " ");
            }
            else if(i == 0){
                System.out.print("[" + arr[i] + " ");
            }else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("=====================这是一个分割线=========================");
        gaiJin(arr);
        gaiJin(arr1);
    }
    public static void gaiJin(int arry[]){
        for(int i = 0;i < arry.length;i++){
            if(i == (arry.length-1)){
                System.out.println(arry[i]+ " ]" + " ");
            }
            else if(i == 0){
                System.out.print("[" + arry[i] + " ");
            }else {
                System.out.print(arry[i] + " ");
            }
        }
    }
}
