package com.bigdata.day05;

/*
        if语句的第二种格式：
            格式：
                if(关系表达式){
                    语句体1;
                }else{
                    语句体2;
                }
            执行流程：
                首先判断关系表达式看其结果是true还是false
                如果是true就执行语句体1
                如果是false就执行语句体2

            举例：
                上厕所案例，用键盘录入实现

            分析：
                1、导包
                2、创建键盘录入对象
                3、键盘录入信息
                4、if判断输入的信息是男生还是女生
                5、输出

 */
import java.util.Scanner;
public class IfDemo2 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //键盘录入信息
        System.out.println("请输入你是男生还是女生（男生扣1，女生扣2）");

        //接收键盘录入字符串的方法
//        String sex = sc.next();
        int i = sc.nextInt();

        if(i == 1){
            System.out.println("请走男生通道");
        }else {
            System.out.println("请走女生通道");
        }


    }
}
