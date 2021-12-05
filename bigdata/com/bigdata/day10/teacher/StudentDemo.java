package com.bigdata.day10.teacher;

/*
    测试学生类
        创建对象，调用成员变量和方法
 */
public class StudentDemo {
    public static void main(String[] args) {
        //如何创建对象呢？
        //格式： 类 对象名(自定义) = new 类名(...);
        //创建一个学生对象
        Student xiaozhu = new Student();
        Student xiaoming = new Student();
        xiaoming.id = 102002;
        System.out.println(xiaoming.age);
        System.out.println(xiaoming.id);
        //如何获取成员变量呢？
        //格式：
        // 对象名.成员变量名
        //获取xiaozhu的学号
        System.out.println(xiaozhu.id);
        //获取xiaozhu的姓名
        System.out.println(xiaozhu.name);
        //获取xiaozhu的年龄
        System.out.println(xiaozhu.age);


        System.out.println("=================赋值后：=================");
        //由于我们打印发现结果都是系统给的默认值
        //现在我们想给这个对象的成员变量进行赋值
        //给成员变量赋值的格式：
        // 对象名.成员变量名 = 成员变量对应的数据类型的值;
        //给xiaozhu这个对象的学号进行赋值
        xiaozhu.id = 10001;
        //给xiaozhu这个对象的姓名进行赋值
        xiaozhu.name = "Kayleigh";
        //给xiaozhu这个对象的年龄进行赋值
        xiaozhu.age = 18;

        //获取xiaozhu的学号
        System.out.println(xiaozhu.id);
        //获取xiaozhu的姓名
        System.out.println(xiaozhu.name);
        //获取xiaozhu的年龄
        System.out.println(xiaozhu.age);

        //如何调用该对象中的方法
        //格式：
        //      对象名.成员方法
        //调用xiaozhu中的吃饭方法
        xiaozhu.eat();
        xiaozhu.study();
        xiaozhu.sleep();



    }
}
