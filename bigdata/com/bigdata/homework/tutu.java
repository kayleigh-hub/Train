package com.bigdata.homework;
   /* 鸡兔同笼问题(穷举法)
已知:鸡兔共35只,共94只脚,那么鸡和兔各几只?
*/
//穷举法
//鸡 兔
//0 35
//1 34
//2 33
//3 32
//...
//23 12
//...
//35 0

public class tutu {
    public static void main(String[] args) {
        int j = 0;//代表的数量
        int i = 35;//代表的数量
        for(j = 0; j<=35 ; j++,i--){
            if(2 * j + 4 * i == 94){
                System.out.println("鸡的数量" + j );
                System.out.println("兔的数量" + i);
            }
        }
    }
}







