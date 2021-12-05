package com.bigdata.dayy11;

/*
        封装：
            是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。
        好处：
            隐藏实现细节，提供公共的访问方式
            提高了代码的复用性
            提高安全性。
        封装原则：
            将不需要对外提供的内容都隐藏起来。
            把属性隐藏，提供公共方法对其访问。

        封装中的private关键字介绍：
            1、是一个权限修饰符。
            2、可以修饰成员(成员变量和成员方法)
            3、被private修饰的成员只在本类中才能访问。


        练习：
            随机找身边的一个事物，定义一个类
            成员变量用private修饰，提供公共的getXxx()和setXxx()方法
            以及提供一个可以输出所有成员变量的show()方法
            然后定义一个测试类，去创建对象使用看看


 */
class Person {
    private String name;
    private int age;

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setAge(int i) {
        age = i;
    }

    public int getAge() {
        return age;
    }

    //提供一个方法可以输出打印所有的成员变量
    public void show() {
        //被private修饰的成员方法，只能在本类中进行访问
        fun2();
        System.out.println("姓名：" + name + ",年龄：" + age);
    }

    private void fun2() {
        System.out.println("这是一个被private修饰的成员方法");
    }



}


public class PrivateDemo1 {
    public static void main(String[] args) {
        //创建Person对象
        Person p1 = new Person();

        //因为成员变量都被private私有的关键字修饰了，所以在其他类中访问不到。
//        p1.name;
//        p1.age;
        //只用调用公共方法进行获取
        String name = p1.getName();
        int age = p1.getAge();
        System.out.println(name + "---" + age);

        //通过公共的方法对成员变量进行赋值
        p1.setName("kayleigh");
        p1.setAge(18);
        p1.show();

        //被private修饰成员方法，在其他类中也是不可以被访问的。
//        p1.fun2();

    }
}
