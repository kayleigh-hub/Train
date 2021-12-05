package com.bigdata.dayy11;

/*
        学生：
            属性：学号，姓名，年龄
            行为：吃饭，学习，睡觉

        Student:
            成员变量：id,name,age
            成员方法：eat(),study,sleep()
 */

public class Student {
    //先定义成员变量
    //学号
    int id;
    //姓名
    String name;
    //年龄
    int age;

    //定义成员方法
    //吃饭
    public static void eat(){
        System.out.println("吃饭");
    }
    //学习
    public static void study(){
        System.out.println("学习");
    }
    //睡觉
    public static void sleep(){
        System.out.println("睡觉");
    }
}

/*
    测试类
 */
class StudentDemo{
    public static void main(String[] args) {
        //通过类创建一个学生对象
        Student s1 = new Student();

        //访问该对象的成员变量和成员方法
        //访问学号
        System.out.println(s1.id);
        //访问姓名
        System.out.println(s1.name);
        //访问年龄
        System.out.println(s1.age);

        //给成员变量进行赋值
        s1.id = 1001;
        s1.name = "陶华根";
        s1.age = 18;

        //访问该对象的成员变量和成员方法
//        //访问学号
//        System.out.println(s1.id);
//        //访问姓名
//        System.out.println(s1.name);
//        //访问年龄
//        System.out.println(s1.age);
        System.out.println("学号："+s1.id+",姓名："+s1.name+",年龄："+s1.age);


        //访问成员方法
        s1.eat();
        s1.study();
        s1.sleep();





    }

}



















