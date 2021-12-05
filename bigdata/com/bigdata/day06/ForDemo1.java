package com.bigdata.day06;

/*
    循环结构
        循环语句可以在满足循环条件的情况下，反复执行某一段代码，
        这段被重复执行的代码被称为循环体语句，当反复执行这个循环体时，
        需要在合适的时候把循环判断条件修改为false，从而结束循环，
        否则循环将一直执行下去，形成死循环。

    分类：
        1、for循环
        2、while循环
            --do...while循环

    循环语句的组成
        初始化语句：
            一条或者多条语句，这些语句完成一些初始化操作。
        判断条件语句：
            这是一个boolean 表达式，这个表达式能决定是否执行循环体。
        循环体语句：
            这个部分是循环体语句，也就是我们要多次做的事情。
        控制条件语句：
            这个部分在一次循环体结束后，下一次循环判断条件执行前执行。通过用于控制循环条件中的变量，使得循环在合适的时候结束。


        for循环：
            语句格式：
                for(初始化语句;判断条件语句;控制条件语句){
                    循环体代码;
                }

        执行流程：
            A:执行初始化语句，只执行了一遍
            B:执行判断条件语句，看其结果是true还是false
                如果是false，循环结束。
                如果是true，继续执行。
            C:执行循环体语句
            D:执行控制条件语句
            E:回到B继续


 */
public class ForDemo1 {
    public static void main(String[] args) {
        //打印一行HelloWorld
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");

        System.out.println("==================用for循环改进==================");

        //int i=1; 初始化值的作用，因为我们要打印10句HelloWorld,从第一次开始，所以
        //我们需要定义一个变量int类型的变量去开始计数，表示第几次循环
        //i<=10; 条件判断语句，这个语句使用控制是否进入循环的条件
        //i++ 控制循环体中的条件的变化，在这里表示的是，每循环一次，i++
        for(int i=1;i<=10;i++){
            System.out.println("HelloWorld");
        }

    }
}
