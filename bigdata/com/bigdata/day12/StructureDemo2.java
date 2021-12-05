package com.bigdata.day12;
/*
    有些同学开始思考：
        我们在学习构造方法之前，也是new对象出来，现在知道了，内部一直都是调用一个
        无参的构造方法，但是呢，我们在类中并没有区写出来构造方法，所以问题是我们一直
        用的构造方法来自哪里呢？
    注意：
        1、如果我们没有给出构造方法，JVM就会自动的提供一个无参的构造方法给我们。
        2、如果我们给出了构造方法，JVM就不会再提供默认的无参构造方法了。
            入如果我们没有给出无参构造方法，却给出了其他的带参构造方法，JVM就不再会提供默认的无参构造方法
            只要我们给出了构造方法，无论是有参还是无参，JVM就永远不会再提供无参的构造方法
        3、构造在同一个类中也是可以发生重载的。（方法名一致，参数列表不一样，与返回值无关）


    构造方法的作用：
        1、可以在创建对象的时候给对象的成员变量进行赋值


    给对象的成员变量进行赋值的两种方式：
        1、使用类提供的公共的setXxx()方法给成员变量进行赋值
        2、使用带参数的构造方法给私有的成员变量进行赋值，
            注意形参的变量名和成员变量名一样的时候，需要配合this关键字一起使用


 */

class Structure {
    private String name;
    private int age;

    Structure() {
        System.out.println("这是我们自己写的无参构造方法");
    }

    Structure(String name) {
        System.out.println("这是我们自己写的带name参数的带参构造方法");
        this.name = name;
    }

    Structure(int age){
        System.out.println("这是我们自己写的带age参数的带参构造方法");
        this.age = age;
    }

    Structure(String name,int age){
        System.out.println("这是我们自己写的带所有成员变量的参数的带参构造方法");
        this.name = name;
        this.age = age;
    }


    public void show() {
        System.out.println("姓名：" + name + ",年龄：" + age);
    }

}

public class StructureDemo2 {
    public static void main(String[] args) {
        Structure s1 = new Structure();
        //能看到地址值说明咱们的对象已经被new了出来
        System.out.println(s1);
        System.out.println("=======================");


        //创建第二个对象
        Structure s2 = new Structure("李玉伟");
        s2.show(); //李玉伟,0
        System.out.println("=======================");

        //创建第三个对象
        Structure s3 = new Structure(17);
        s3.show();//null,17
        System.out.println("=======================");

        //创建第四个对象
        Structure s4 = new Structure("kayleigh",18);
        s4.show();

    }
}
