package com.bigdata.day12;
/*
        构造方法:
            构造方法的目的是为对象中的数据进行初始化。

        格式：
            1、方法名与类名相同
            2、没有返回值类型，连void都没有
            3、没有具体的返回值



 */

class Student {
    private String name;
    private int age;

    Student(){
        System.out.println("这是无参的构造方法");
    }

    //getXxx()和setXxx()方法
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }


    public void show() {
        System.out.println("姓名：" + name + ",年龄：" + age);
    }


}

public class StructureDemo1 {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        s.show();
    }
}
