package com.bigdata.day05;

/*
        if语句的第三种格式：
            if(关系表达式1){
               语句体1;
            }else if(关系表达式2){
                语句体2;
            }else if(关系表达式3){
                语句体3;
            }
            ...
            else{
                语句体n;
            }

        需求：
            学生考试成绩判断：
                0-60     不及格
                60-80     中等
                80-90     良好
                90-100    优秀
            键盘录入改进

 */
import java.util.Scanner;
public class IfDemo4 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //接收键盘录入的学生成绩
        System.out.println("请输入罗光元的数学成绩：");
        int score = sc.nextInt();

        if(0<=score & score<60){
            System.out.println("不及格");
        }else if(60<=score & score<80){
            System.out.println("中等");
        }else if(80<=score & score<90){
            System.out.println("良好");
        }else {
            System.out.println("优秀");
        }


    }
}
