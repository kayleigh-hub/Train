package com.bigdata.day12;

/*
        static的特点：它可以修饰成员变量和成员方法
        1、随着类的加载而加载
            运行之前会将class类文件加载到方法区中，而被static修饰的成员是随着
            类的加载而加载，所以被static修饰的成员在方法区存放。
            回想一下main方法
        2、优先于对象存在
        3、被类所有的对象共享
            举例：所有的中国人的国籍信息都一样
            什么时候使用static关键字呢？
                如果说明某个成员变量是被所有对象共享的，那么它就应该被定义为静态的。
            举例：
                哈罗单车：（可以被static修饰）
                自己的水杯：（不可以被static修饰）
        4、被静态修饰的成员可以直接通过类名调用
            一般情况下，我们今后开发的时候，只要看到类中有静态的成员变量或者成员方法
            今后调用的时候，一律用 类名.静态成员 这样的方式区调用

            推荐使用类名的方式调用，这也是规范。
            通过调用的方式不同区分不同的成员

            所以被静态修饰的成员，一般情况下被称之为：类成员，与类相关的

 */

class Demo2{
    //定义一个非静态的成员变量
    int a = 10;

    //定义一个静态的成员变量
    static int b = 20;
}

public class StaticDemo1 {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        System.out.println(d1.a);
        System.out.println(d1.b);
        System.out.println(Demo2.b);
    }
}
