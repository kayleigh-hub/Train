package com.bigdata.dayy11;

/*
        匿名对象：简单来说，就是没有名字的对象

        用内存的形式解释：
            我们在学习匿名对象之前，一直都是在堆内存中new对象，然后将地址值
            赋给栈里面的变量，这个变量也就是对象的名字。
            而匿名对象，就说明没有栈中变量引用。

        匿名对象的使用场景
            1、当调用方法的时候，仅仅只调用一次的时候，可以使用匿名对象
                调用多次的时候，不适合使用匿名对象
                那么，匿名存在的意义是什么？
                    某些情况下，我们就想使用一次某个对象中的功能，后续也不会使用它了
                    这时候，就可以使用匿名对象，使用完之后，
                    就被JVM认为是一个垃圾空间（栈里面没有引用指向它），等待被回收。
            2、匿名对象可以在调用方法的时候被当作参数进行传递

 */

class Computer{
    public void coding(){
        System.out.println("敲代码");
    }
}

//同一个包下，类名不能重复
class Demo3{
    public void method(Computer c){
        c.coding();
    }
}


public class AnonymousDemo {
    public static void main(String[] args) {
        //在没有学习匿名对象之前，我们如果想使用其他类中的方法，就必须创建对象
        Computer com = new Computer();
        com.coding();

        //匿名对象
        new Computer().coding();


        //使用第一个对象再调一次方法
        com.coding();

        //创建Demo3的对象
        Demo3 demo3 = new Demo3();

        //匿名对象当作参数传递
        System.out.println("=====匿名对象当作参数传递======");
        demo3.method(new Computer());

    }
}
