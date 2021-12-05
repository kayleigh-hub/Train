package com.bigdata.day06;

/*
    模拟做单项选择题，根据你的选择，给出对应的答案。(表达式是字符的情况)

    数加学院怎么样？

    A: 非常好   B: 很好    C: 优秀    D: 无与伦比

 */
import java.util.Scanner;
public class SwitchTest1 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("题目：数加学院怎么样？");
        System.out.println("请输入你选择的选项（A/B/C/D）其中一个");
        String s = sc.next();

        switch (s){
            case "A":
                System.out.println("A选项：非常好");
                break;
            case "B":
                System.out.println("B选项：很好");
                break;
            case "C":
                System.out.println("C选项：优秀");
                break;
            case "D":
                System.out.println("D选项：无与伦比");
                break;
            default:
                System.out.println("您输入的选项有误");
                break;
        }





    }
}
