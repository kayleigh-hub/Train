package com.bigdata.day06;

/*
        do...while和while区别

        while循环，执行的时候，会先进行一次判断，如果是true才执行循环体
        do...while循环，执行的时候，会先执行一次循环体内容，然后再判断是true还是false

        写程序优先考虑for循环，再考虑while循环，最后考虑do…while循环。

 */
public class DoWhileDemo3 {
    public static void main(String[] args) {
        int i = 0;
        while (i>0){
            System.out.println(i);
            i--;
        }
        System.out.println("============do...while循环============");

        do{
            System.out.println(i);
            i--;
        }while (i>0);

    }
}
