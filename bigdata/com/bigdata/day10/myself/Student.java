package com.bigdata.day10.myself;


public class Student{
    //学生姓名
    public String Name;
    //学生年龄
    public int Age;
    //学生性别
    private boolean Sex;

    //上述代码中将学生性别属性 Sex 设置为 private 作用域。
    // 为了对该属性进行获取和设置，还需要编写 isSex 和 setSex 方法。
    public boolean isSex(){
        return Sex;
    }
    public void setSex(boolean sex){
            this.Sex = sex;
    }

    public static void main(String[] args) {
        Student zhang = new Student();//创建第一个实例
        zhang.Name = "张";
        String isMan = zhang.isSex() ? "女" : "男";
        System.out.println("姓名："+ zhang.Name + "性别：" + isMan + "年龄：" +zhang.Age);
        Student li = new Student();
        //创建第二个实例
        li.Name = "李";
        li.Sex = true;
        li.Age = 15;
        String isWoman = li.isSex() ? "女" : "男";
        System.out.println("姓名："+ li.Name + "性别：" + isWoman + "年龄：" +li.Age);

    }
    //上述代码创建了一个名称为 printInfo 的方法，
    // 其返回值类型为 StringBuffer（引用数据类型）。
    // 该方法需要传递一个 Student 类型的参数，
    // 最后需要将一个 StringBuffer 类型的数据返回。
    public StringBuffer printInfo(Student st){
        StringBuffer sb = new StringBuffer();
        sb.append ("学生姓名：" + st.Name+"\n 学生年龄：" +st.Age+"\n 学生性别："+ st.isSex() );
        return sb;
    }
}



