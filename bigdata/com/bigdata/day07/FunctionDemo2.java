package com.bigdata.day07;

/*
    没有明确返回值的方法
        没有返回值的时候，方法上定义的返回值类型为void
        void表示该方法，没有任何返回值

    注意：
        1、即使我们的方法没有写返回值类型，也是需要调用才能执行
        2、没有明确返回值类型的方法，是可以单独调用的
 */
public class FunctionDemo2 {
    public static void main(String[] args) {
        eat();
    }

    //定义一个方法表示吃饭
    public static void eat(){
        System.out.println("吃饭");
    }
}
