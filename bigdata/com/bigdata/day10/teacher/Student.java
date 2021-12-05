package com.bigdata.day10.teacher;

/*
        类是用来描述现实世界中的事物

        学生：
            属性：学号，姓名，年龄
            行为：吃饭，学习，睡觉

        类：
            Student:
                成员变量：id,name,age
                成员方法：eat(),study(),sleep()
 */
public class Student {
    //定义该类中的成员变量
    //格式：
    //      修饰符 数据类型 变量名;
    //目前还没有系统地学习过修饰符，目前不加修饰符
    //学号
    int id;
    //姓名
    String name;
    //年龄
    int age;

    //定义成员方法
    //目前定义的格式：
    //  修饰符 返回值类型 方法名(参数列表){..}
    //目前修饰符使用 public static
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
