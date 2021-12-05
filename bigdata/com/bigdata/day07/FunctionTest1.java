package com.bigdata.day07;

/*
        键盘录入两个数据，返回两个数中的较大值
 */

import java.util.Scanner;

public class FunctionTest1 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();

        //定义一个方法，调用该方法获取两个数中的最大值
        System.out.println("====获取两个数中的最大值================");
        int max = maxNum(a, b);
        System.out.println("两数较大的值为：" + max);

//        System.out.println(maxNum(12,70));

        //比较a和b是否相同
        System.out.println("=====比较a和b是否相同==============");
        boolean res = equalsNum(a,b);
        System.out.println(res);

        System.out.println("=====获取a,b,c中最大的数==============");
        System.out.println("请输入第三个数：");
        int c = sc.nextInt();
        int res2 = maxNumThree(a,b,c);
        System.out.println(res2);


    }

    //比较两个数较大
    public static int maxNum(int x1, int x2) {
        if (x1 > x2) {
            return x1;
        } else {
            return x2;
        }
    }

    //键盘录入两个数据，比较两个数是否相等
    public static boolean equalsNum(int x1,int x2){
        if(x1==x2){
            return true;
        }else {
            return false;
        }
    }

    //键盘录入三个数据，返回三个数中的最大值
    public static int maxNumThree(int x1,int x2,int x3){
        if(x1 > x2){
            if(x1 > x3){
                return x1;
            }else {
                return x3;
            }
        }else {
            if(x2 > x3){
                return x2;
            }else {
                return x3;
            }
        }
    }

}






