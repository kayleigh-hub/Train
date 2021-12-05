package com.bigdata.day12;

/*
     静态成员访问的问题：
        1、static可以修饰成员变量和成员方法
        2、
           非静态的成员方法：
                1)访问的是非静态的成员变量
                    可以
                2)访问的是静态的成员变量
                    可以
                3)访问的是非静态的成员方法
                    可以
                4)访问的是静态的成员方法
                    可以
           总结：非静态的成员方法可以访问静态的成员也可也访问非静态的成员

            静态的成员方法：
                1)访问的是非静态的成员变量
                    不可以
                2)访问的是静态的成员变量
                    可以
                3)访问的是非静态的成员方法
                    不可以
                4)访问的是静态的成员方法
                    可以
           总结：静态的成员方法只能访问静态的成员




 */

class Demo3{
    //非静态的成员变量
    int a = 10;

    //静态的成员变量
    static int b = 20;


    //非静态的成员方法
    public void fun1(){
        System.out.println(a);
        System.out.println(b);
        fun2();
        fun3();
    }

    public static void fun2(){
        //Error:(47, 28) java: 无法从静态上下文中引用非静态 变量 a
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("这是静态的成员方法fun2");
        //Error:(51, 9) java: 无法从静态上下文中引用非静态 方法 fun3()
//        fun3();
        fun4();
    }

    public void fun3(){
        System.out.println("这个是非静态的成员方法fun3");
    }

    public static void fun4(){
        System.out.println("这是静态的成员方法fun4");
    }

}

public class StaticDemo2 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
//        d.fun1();
        Demo3.fun2();
        fun();
    }


    public static void fun(){
        System.out.println("helloworld");
    }
}
