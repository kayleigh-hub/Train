package com.bigdata.day06;

/*
        看程序写结果
 */
public class SwitchTest3 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        switch (x) {
            default:
                y++;  //y=4
                break;
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y=" + y);

    }
}
