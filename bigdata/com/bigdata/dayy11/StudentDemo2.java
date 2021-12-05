package com.bigdata.dayy11;


class Student3 {
    //定义成员变量
    private String name;
    private int age;

    //提供公共的getXxx()和setXxx()方法
    //回想一下，我们之前给变量进行命名的时候，有一个规则：见名知意
    //所以我们改一下
    //我们根据变量命名规则的见名之意的方式修改了形参的名字，但是呢
    //运行程序后发现，虽然我们也调用了方法，也进行了传参，但是，结果依旧没有成功赋值
    //这是为什么呢？
    //因为变量的调用遵循就近原则
    //我们理想上，是想让传进来的这个参数赋值给该对象的成员变量
    //实际上传进来的实参的值后面进行赋值的时候，还是赋值给方法上的变量，与成员变量没有关系
    //想的是，将传进来的name值赋值给当前对象的name值
    public void setName(String name) { //"姜水旺"
        //Student3.name这种写法，我们没有介绍过
        //如果有一个东西可以代表当前调用该方法的对象就好了
        //谁可以代替当前方法的对象呢？
        //java提供了一个关键字：this
//        Student3.name = name;
        //这样写，就代表将传进来的参数，赋值给当前调用该方法的对象的成员变量name
        this.name = name;
    }

    public String getName() {
        //其实这里隐藏了一个this关键字,代表的是返回当前调用该方法的对象的成员变量name
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("姓名：" + name + ",年龄：" + age);
    }

}


public class StudentDemo2 {
    public static void main(String[] args) {
        //创建学生对象并对成员变量进行赋值
        Student3 s1 = new Student3();
        //对s1对象的姓名进行赋值
        s1.setName("keyleigh");
        s1.setAge(18);
        //调用show()方法查看所有成员变量值
        s1.show();
    }
}
