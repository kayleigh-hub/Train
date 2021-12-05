package com.bigdata.day12.homew;

/*
    2.以面向对象的思想，编写自定义类描述IT从业者。设定属性包括：姓名，年龄，技术方向，工作年限, 工作单位和职务；方法包括：工作
    要求：
    1) 设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
    2) 限定IT从业人员必须年满15岁，无效信息需提示，并设置默认年龄为15。
    3) 限定“技术方向”是只读属性
    4) 工作方法通过输入参数，接收工作单位和职务，输出个人工作信息
    5) 编写测试类，测试IT从业者类的对象及相关方法（测试数据信息自定义）
 */

public class Staff {
    private String name;
    private int age;
    private String jishu;
    private int workage;
    private String where;
    private String zhiwu;

    public void work(String s){
        System.out.println(s);
    }
    Staff(){

    }

    Staff(String name,int age,String jishu,int workage,String where,String zhiwu){
        this.age = age;
        this.name = name ;
        this.jishu = jishu;
        this.workage = workage;
        this.where = where;
        this.zhiwu = zhiwu;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age < 15){
            System.out.println("你输入的年龄有误");
            this.age = 15;
        }else {
            this.age = age;
        }
    }
    public int age(){

            return age;
    }
    public void setJishu(String jishu){
        this.jishu = jishu;

    }
    public String getJishu(){
        return jishu;
    }

    public void setWorkage(int workage){
        this.workage = workage;
    }
    public int getWorkage(){
        return workage;
    }

    public void setWhere(String where){
        this.where = where;
    }
    public String getWhere(){
        return where;
    }

    public void setZhiwu(String zhiwu){
        this.zhiwu = zhiwu;
    }
    public String getZhiwu(){
        return zhiwu;
    }



}
class StaffDemo{
    public static void main(String[] args) {
        Staff s1 = new Staff();
        Staff s2 = new Staff();

        s1.setAge(35);
        s1.setName("马尾龙");
        s1.setJishu("数据库维护");
        s1.setZhiwu("数据库维护工程师");
        s1.setWhere("腾讯实业");
        s1.setWorkage(10);

        String name = s1.getName();
        int age = s1.age();
        int wprkage = s1.getWorkage();
        String where = s1.getWhere();
        String jishu = s1.getJishu();
        String zhiwu = s1.getZhiwu();
        System.out.println("姓名："+name +"\n" + "年龄：" + age +"\n" +"技术方向:"+ jishu+"\n"+"工作年限："+wprkage+"\n" + "目前就职于："+where +"\n"+
                                  "职务是：" + zhiwu );
        System.out.println("=============================================");

        s2.setAge(15);
        s2.setName("马尾龙");
        s2.setJishu("数据库维护");
        s2.setZhiwu("数据库维护工程师");
        s2.setWhere("腾讯实业");
        s2.setWorkage(10);

        String name1 = s2.getName();
        int age1 = s2.age();
        int wprkage1 = s2.getWorkage();
        String where1 = s2.getWhere();
        String jishu1 = s2.getJishu();
        String zhiwu1 = s2.getZhiwu();
        System.out.println("姓名："+name1 +"\n" + "年龄：" + age1 +"\n" +"技术方向:"+ jishu1+"\n"+"工作年限："+wprkage1+"\n" + "目前就职于："+where1 +"\n"+
                "职务是：" + zhiwu1 );
    }
}