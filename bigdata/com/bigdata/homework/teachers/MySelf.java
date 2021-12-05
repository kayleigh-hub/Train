package com.bigdata.homework.teachers;
import java.util.Scanner;
//public class MySelf<age> {
//    public void main(String[] args) {
//        /*
//         * 输入自己的名字，年龄和性别，分别用不同的变量接收，并将输入的信息做输出。
//         * */
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入您的姓名：");
//        String name = input.next();
//        System.out.print("请输入你的年龄：");
//        int age = input.nextInt();
//        System.out.print("请输入你的性别：");
//        char gender = input.next().charAt(0);
//
//        myName(name,age,gender);
//
//
//    }
//    public class myName<name, gender>(String name, int age, char gender){
//                System.out.println("输出信息如下：");
//        System.out.println("你的姓名是：" + name);
//        System.out.println("你的年龄是：" + age +"岁");
//        System.out.println("你的性别是：" + gender);
//    }
//public static void main(String[] args) {
//
//}

//}




public class MySelf {

    public static void main(String[] args) {

        System.out.println("请输入一个整数：");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();		//获取键盘输入
        scanner.close();

        trans2(a);	//调用任意方法
    }

    //十进制转换二进制方法
    static void trans1(int a) {
        StringBuffer str = new StringBuffer();

        //除二取余，逆序排列法
        while(a!=0) {
            if(a%2!=0) { //该数为奇数除于2时有余数
                str.insert(0,"1");	//因为是逆序排列，所以需要将每次添加的1或0放至字符串首位
            }else {//为偶数情况
                str.insert(0,"0");
            }

            a = a/2;
        }
        System.out.println("转换为二进制为："+str);
    }

    static void trans2(int a) {
        String str2 = "";
        while(a!=0) {
            if(a%2!=0) {
                str2 = "1"+str2;
            }else {
                str2 = "0"+str2;
            }
            a = a/2;
        }
        System.out.println("二进制输出为："+str2);
    }

}
