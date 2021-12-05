package com.bigdata.day10.teacher;
/*
        创建数组oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        要求把0去除，新的数据放在；另外一个数组中去
 */
public class Test41 {
    public static void main(String[] args) {
        int[] oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        //为了获取新的数组的长度
        int num = 0;
        for(int i = 0;i < oldArr.length;i++) {
            if (oldArr[i] != 0) {
                num += 1;
            }
        }
        //创建新的数组，数组的长度就是num；
        int[] newArr = new int[num];
        int j = 0;
        for(int i = 0;i < oldArr.length;i++){
            if(oldArr[i] != 0){
                newArr[j] = oldArr[i];
                j++;
            }
        }
        printArr(newArr);
    }
    public static void printArr(int[] array){
        for(int i = 0;i < array.length;i++){
            if(i == 0){
                System.out.print("["+ array[i] + ",");
            }else if(i == array.length-1){
                System.out.print(array[i] + "]");
            }else{
                System.out.print(array[i]+",");
            }
        }
    }
}
