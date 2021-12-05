package com.bigdata.day12.homew;

public class DogDemoi {
    //狗狗的品种
    String brand ;
    //狗狗的年龄
    int age ;
    //狗狗的情绪
    String emon;
    //狗狗额名字
    String name;

    DogDemoi(){

    }
    DogDemoi(String b ,int age ,String emon,String name){
        this.brand = brand;
        this.age = age;
        this.emon = emon;
        this.name =name ;
    }

    public void cro(String s){
        System.out.println(s +"围着主人身边转");
    }

    public void run(String s){
        System.out.println(s +"汪汪叫");
    }
    public void setBrand(String brand){ this.brand = brand;}
    public String getBrand(){ return brand;}

    public void setAge(int age ){this.age = age;}
    public int getAge(){ return age ; }

    public void setEmon(String emon){ this.emon = emon;}
    public String getEmon(){ return emon;}

    public void setName(String name){this.name = name;}
    public String getName(){ return name;}

    public void show(){
        System.out.println("名字叫"+name+"的"+brand+"心情"+emon );
    }
}

class dog{
    public static void main(String[] args) {
        DogDemoi s1 = new DogDemoi();
        s1.age = 2;
        s1.emon = "很好";
        s1.brand = "贵宾犬";
        s1.name = "甜心";


        s1.show();
        s1.cro("开心的");;
        s1.run("开心的");;
    }
}