package com.bigdata.homework;
import java.util.Scanner;

/*
        BMI 指数测试 BMI = 体重 (kg) / 身高 (m)
        接收用户输入的身高和体重,将判断结果输出
        过轻：低于18.5
        正常：18.5 ~ 22.9
        偏胖：23 ~ 24.9
        肥胖：25 ~ 29.9
        重度肥胖：高于30
        极度肥胖：高于40
 */
public class TestBMI {
    public static void main(String[] args) {
        //提示用户输入自己的饿身高和体重
        System.out.println("请输入你的身高（单位m）");
        double height = new Scanner(System.in).nextDouble();
        System.out.println("请输入你的体重（单位kg）");
        double  weight = new Scanner(System.in).nextDouble();

        //调用GetBMI方法
        GetBMI(height,weight);
    }

    public static void GetBMI(double h, double w) {
        String r = " ";
        double bim = w / h ;
        if(bim < 18.5){
            r = "过轻";
        }else if(bim <= 22.9){
            r = "正常";
        }else if(bim <= 24.9){
            r = "偏胖";
        }else if(bim <= 29.9){
            r = "肥胖";
        }else if(bim <= 40){
            r = "重度";
        }else {
            r = "极度";
        }
        System.out.println("你的BIM指数是："+ bim);
        System.out.println("你的体重属于" + r);
    }
}











