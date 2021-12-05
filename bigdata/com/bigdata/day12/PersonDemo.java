package com.bigdata.day12;


/*
        定义一个人的类
        经过测试发现，我们举例子的时候，都是中国人，国籍都一样，都是中国
        一样的国籍，每次创建的时候，都会在堆内存开辟一个这样的变量空间
        总觉得有点浪费。
        有没有什么办法，让所有一样国籍的人共用一个国籍的值
            针对多个对象拥有共同的成员变量，值是一样的时候
            Java提供了一个关键字给我们处理这样的情况，这个关键字叫做：static

        可以修饰成员变量和成员方法，修饰成员变量的时候，可以让多个对象共用一个成员变量的值。

 */

class Person{
    //姓名
    private String name;
    //年龄
    private int age;
    //国籍
//    private String nationality;
    private static String nationality;


    public Person() {
    }

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void show(){
        System.out.println("姓名："+name+",年龄："+age+",国籍："+nationality);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        //创建第一个对象
        Person p1 = new Person("宋轶",26,"中国");
        p1.show();

        //创建第二个对象
        Person p2 = new Person("胡歌",30);
        p2.show();

        //创建第三个对象
        Person p3 = new Person("钱学森",18);
        p3.show();
        System.out.println("==========================================");

//        p1.setNationality("俄罗斯");
//        p1.show();
//        p2.show();
//        p3.show();
//


    }
}
