package com.bigdata.day06;

/*
        while循环
            语句格式：
                简化格式：
                    while(关系表达式){
                        循环体语句;
                    }
                完整格式：
                    初始化语句;
                    while(关系表达式){
                        循环体语句;
                        控制条件语句;
                    }
            结论：for循环可以等价转换为while循环

            执行流程
                1、先执行初始化语句
                2、判断关系表达式的结果，
                    如果是true,进入while循环，执行循环体内容
                    如果是false,就不进入while循环，不执行循环体内容
                3、如果进入循环体内容，执行循环体代码和控制条件语句
                4、知道关系表达式的结果为false，终止while循环

        死循环介绍：
            for(;;){}
            while(true){}

 */
public class WhileDemo1 {
    public static void main(String[] args) {
        //需求：打印10遍HelloWorld
        System.out.println("===============用for循环实现===============");
        for(int i=1;i<=10;i++){
            System.out.println("HelloWorld");
        }

        System.out.println("===============用while循环实现===============");
        int i=1;
        while (i<=10){
            System.out.println("HelloWorld");
            i++;
        }

        System.out.println("=============死循环================");
        int i1 = 0;
        while (true){
            System.out.println("这是死循环"+i1);
            i1++;
        }
    }
}
