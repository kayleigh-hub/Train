package com.bigdata.day09;
import java.util.Scanner;
public class ArrayDemo31 {
    public static void main(String[] args) {
        String[] a = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
        Scanner sc = new Scanner(System.in);

        while(true){
            int aa = sc.nextInt();
            if(1 <= aa && aa <= 7){
                System.out.println(a[aa-1]);
            }else if (aa == 0){
                System.out.println("jieshu");
                break;
            }else{
                System.out.println("重新输入");
            }
        }
    }
}
