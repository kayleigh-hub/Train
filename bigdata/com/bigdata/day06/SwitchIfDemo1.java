package com.bigdata.day06;

/*
        switch语句与if语句嵌套使用

        买饮料的案例
 */
import java.util.Scanner;
public class SwitchIfDemo1 {
    public static void main(String[] args) {

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //可乐 3, 旺仔牛奶 5, 红牛 6, 农夫山泉 2, 脉动 4
        //键盘录入数据表示身上有多少钱
        System.out.println("请输入您身上带了多少钱：");
        int money = sc.nextInt();

        if(money>=2 & money<100){
            System.out.println("欢迎光临！！！");

            switch (money){
                case 2:
                    System.out.println("购买农夫山泉");
                    break;
                case 3:
                    System.out.println("购买可乐");
                    break;
                case 4:
                    System.out.println("购买脉动");
                    break;
                case 5:
                    System.out.println("购买旺仔牛奶");
                    break;
                case 6:
                    System.out.println("购买红牛");
                    break;
                default:
                    System.out.println("没有你想要的饮料");
                    break;
            }
        }else if(0<money & money<2){
            System.out.println("您带的钱太少了，下次带多一点");
        }else if(money >=100){
            System.out.println("随便挑");
        }else {
            System.out.println("你是个穷鬼，下次再来吧");
        }

    }
}
