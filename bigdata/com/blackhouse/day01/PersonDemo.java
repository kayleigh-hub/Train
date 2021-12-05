package com.blackhouse.day01;

public class PersonDemo {
    public static void main(String[] args) {
        Person s1 = new Person();
        s1.name = "kayleigh";
        s1.showName();

        System.out.println("=======================================");
        new Person().name = "kaylemon";
        //这里会输出null，原因就是匿名对象只能使用唯一的一次，下一次的使用不得不再创建一个对象
        //使用建议：如果确定有一个对象，只需要使用一次。就可以用这个匿名对象。
        //匿名对象也可以做参数和返回值。
        new Person().showName();
    }
}
