package com.bigdata.day11;


class Person{
    private String name;
    private  int age;
    private String num;
    private String address;


//    public String getname(){
//        return name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }


    public void setAge(int age ){
        if(age < 18 || age > 40){
            System.out.println("a");
            this.age = 20;
        }else{
            this.age = age;
        }
    }
    public int getage(){
        return age;
    }



    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public void setNum(String num){
        this.num = num;
    }
    public String getNum(){
        return num;
    }




    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }


    public void show (){
        System.out.println("name:" + name +"，"+ "age:" + age+"，" + "num:" + num +"，"+ "address:" + address);
    }
}

class PtivateDemo {
    public static void main(String[] args) {
        Person s2 = new Person();
        s2.setName("kayleigh住");
        s2.setAge(18);
        s2.setAddress("安徽");
        s2.setNum("123456789");
        s2.setAddress("s");
        s2.show();

    }

}

