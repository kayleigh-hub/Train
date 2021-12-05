package com.bigdata.day06;

/*
    debug查看运行过程
    1、先在左边将你要查看流程的代码标红
    2、右击debug
    3、点一次》，执行一次步骤，观察执行流程和变量值的变化

    debug的好处
    让我们更加清晰地明白程序是如何执行的，以及变量是如何变化的
 */
public class DoWhileDemo2 {
    public static void main(String[] args) {
        //统计1-10之和
        int sum = 0;
        int i = 1;
        do {
            sum = sum + i;
            i++;
        } while (i <= 5);

        System.out.println("1-10之和为：" + sum);
    }
}
