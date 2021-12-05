package com.bigdata.day12;

/*
        类的组成：成员变量，成员方法
        今天又学习了一个新的成员：构造方法
        改进一下我们之前写的类：
            成员变量
            构造方法
            成员方法：
                根据有无返回值：
                    1、没有返回值的成员方法
                    2、有返回值的成员方法
                根据有无参数：
                    1、无参的成员方法
                    2、有参数的成员方法
 */

class Student2 {
    private String name;
    private int age;

    //无参构造方法
    Student2() {

    }

    //包含所有成员变量的参数的构造方法
    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //公共的getXxx()方法和setXxx()方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //无参无返回值的成员方法
    public void printHello() {
        System.out.println("HelloWorld");
    }

    //无参有返回值的成员方法
    public String getTianQi() {
        return "晴天";
    }

    //带参无返回值的成员方法
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    //带参有返回值的成员方法
    public String concat(String s1, String s2) {
        return s1 + s2;
    }

    //定义一个方法将所有的成员变量输出
    public void show() {
        System.out.println("姓名：" + name + ",年龄：" + age);
    }


}

public class StudentDemo {
    public static void main(String[] args) {
        //使用无参的构造方法创建对象
        Student2 s1 = new Student2();
        s1.show();
        //调用无参无返回值的成员方法
        s1.printHello();
        //调用无参有返回值的成员方法
        String tianqi = s1.getTianQi();
        System.out.println(tianqi);
        //调用带参有返回值的成员方法
        String s = s1.concat("数加科技","yyds");
        System.out.println(s);
        //调用带参无返回值的成员方法
        s1.sum(12,45);

        //使用带参的构造方法创建对象
        Student2 s2 = new Student2("陶华根",16);
        s2.show();

    }
}
