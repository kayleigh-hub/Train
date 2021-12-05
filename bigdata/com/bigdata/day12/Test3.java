package com.bigdata.day12;

/*
        定义一个员工类,自己分析出几个成员，
        然后给出成员变量，构造方法，getXxx()/setXxx()方法，
        以及一个显示所有成员信息的方法。并测试。


        员工：
            属性：工号，姓名，年龄，薪水
            行为：敲代码，吃饭，喝水


 */

class Staff {
    private String id;
    private String name;
    private int age;
    private int salary;

    Staff() {

    }

    Staff(String id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    //以及一个显示所有成员信息的方法
    public void show() {
        System.out.println("工号：" + id + ",姓名：" + name + ",年龄：" + age + ",薪水：" + salary);
    }

}


public class Test3 {
    public static void main(String[] args) {
        //使用带参数的构造方法创建对象
        Staff s = new Staff("SJ005","王友虎",18,1000000);

        s.show();

    }
}
