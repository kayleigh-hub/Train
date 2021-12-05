package com.bigdata.dayy11;


//定义一个动物类，叫的方法
class Animal {
    public void shout() {
        System.out.println("动物叫");
    }
}

class Demo1 {
    //类是一个引用数据类型，所以它可以当作形参的数据类型
    //今后当你看到一个方法上的形参的数据类型是一个类的时候
    //实际上它需要的是一个对应类的对象的地址值
    public void fun1(Animal a) { // animal = new Animal();
        a.shout();
    }
}

class Demo2 {
    //当方法的参数是基本数据类型的时候
    //调用方法的时候传入的是该基本数据类型实际的数值
    public void fun2(int x, int y) {
        System.out.println(x + y);
    }
}


public class ParameterDemo {
    public static void main(String[] args) {
        //要想调用fun1()这个方法，就必须创建Demo1这个类的对象
        //因为只有对象才能去调用方法
        Demo1 d = new Demo1();

        //创建一个Animal类的对象
        Animal animal = new Animal();
        d.fun1(animal);

        //创建Demo2的对象
        Demo2 d2 = new Demo2();
        int i = 10;
        int j = 20;
        d2.fun2(j, i);

    }
}
