package com.bigdata.dayy11;

public class person {
    private int age;
    private double high;

    public void setAge(int age){
        if(age < 18 || age < 50){
            System.out.println("cuode");
            this.age = 20;
        }else{
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }


    public void setHigh(double high){
        this.high = high;
    }
    public double getHigh(){
        return high;
    }


    public void show(){
        System.out.println("年龄："+age + "," + "身高：" + high + "，");
    }
}
class personDemo{
    public static void main(String[] args) {

        person s1 = new person();

        s1.setAge(19);
        s1.setHigh(178.34);
        s1.show();

    }
}