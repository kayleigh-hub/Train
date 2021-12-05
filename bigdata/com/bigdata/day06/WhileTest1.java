package com.bigdata.day06;

/*
        我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。
        请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?

        分析：
            1、高度：8848
            2、一张纸的厚度是0.01 ，也就是初始值为0.01
            3、每叠一次，相当于厚度*2
            4、叠多少次呢？我们不知道，但是我们知道直到厚度>=8848,不继续叠了
            5、由于我们不知道叠多少次，优先考虑while循环

 */
public class WhileTest1 {
    public static void main(String[] args) {
        int num = 0;
        for(double i=0.01;i<=8848;i=i*2){
            num = num + 1;
        }
        System.out.println(num);


        System.out.println("========================while循环实现========================");

        int height = 8848;
        int count = 0; //定义变量表示叠的次数
        double houDu = 0.01;

        while (houDu<=8848){
            houDu = houDu * 2;
            count = count + 1;
            System.out.println("此刻是第"+count+"次叠，此时厚度为："+houDu);
        }

        System.out.println("折叠了"+count+"次，厚度为："+houDu);

    }
}
