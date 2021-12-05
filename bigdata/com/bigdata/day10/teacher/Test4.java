package com.bigdata.day10.teacher;

/*
        4.合并数组操作：现有如下一个数组：
            int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}
          要求将以上数组中值为0的项去掉，将不为0的值存入一个新的数组，
          生成的新数组为： int newArr [] ={1,3,4,5,6,6,5,4,7,6,7,5}

        分析：
            1、创建旧的数组
            2、遍历旧的数组，获取到每个元素
            3、判断元素是否为0
            4、创建新的数组，这里的数组长度为多少呢？
            5、如果旧的数组元素不为0，就插入到新的数组中，如果为0不管他
            6、遍历新的数组

        难点：
            1、如何获取新数组的元素个数
            2、如何在查找元素不为0的时候插入到新的数组
 */
public class Test4 {
    public static void main(String[] args) {
        //创建旧的数组
        int[] oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};


        int num = 0;

        //遍历旧的数组，获取到每个元素
        for(int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){
                num = num + 1;
            }
        }

        //创建新的数组
        int[] newArr = new int[num];

        //定义一个变量控制新数组的索引变化
        int index = 0;

        for(int i=0;i<oldArr.length;i++){
            if(oldArr[i]!=0){
                newArr[index] = oldArr[i];
                index++;
            }
        }

        //遍历新的数组
        printArray(newArr);


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
