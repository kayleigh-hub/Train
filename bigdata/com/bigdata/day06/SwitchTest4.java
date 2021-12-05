package com.bigdata.day06;

/*
        看程序写结果第2版
 */
public class SwitchTest4 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        switch(x){
            default:
                y++;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y="+y);

    }
}
