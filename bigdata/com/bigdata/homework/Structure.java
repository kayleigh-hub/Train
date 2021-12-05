package com.bigdata.homework;

class Structure {
    private String name;
    private int age;

    Structure() {System.out.println("这是一个没有参数的无参构造方法");}

    Structure(String name ,int age){
        System.out.println("这是我们写的带所有成员变量的构造方法");
        this.name = name;
        this.age =age;
    }
    Structure(String name){
        System.out.println("这是我们写的带一个name的成员变量的构造方法");
    }

    public void show(){
        System.out.println("name :" + name + ",age:" + age);
    }

}
class StructureDemo{
    public static void main(String[] args) {
        Structure a = new Structure();
        Structure s = new Structure("kayleigh",18);
        Structure s1 = new Structure("keyleigh");
        s.show();;
        s1.show();
    }
}
