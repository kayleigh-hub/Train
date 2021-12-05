package com.bigdata.day06;

/*
        请在控制台输出满足如下条件的五位数
            个位等于万位
            十位等于千位
            个位+十位+千位+万位=百位

            20402

        分析：
            1、获取10000-99999的数据
            2、获取获取个位，十位，百位，千位，万位
            3、&&连接三个条件

       12345 % 10 == 5   12345/10 = 1234
       1234 % 10 == 4    12345/10/10 = 123
       123 % 10 == 3     12345/10/10/10 = 12
       12 % 10 == 2      12345/10/10/10/10 = 1
       1 % 10 == 1



 */
public class ForTest5 {
    public static void main(String[] args) {
        for(int i=10000;i<=99999;i++){
//            System.out.println(i);
            //获取个位
            int geWei = i%10;
            //获取十位
            int shiWei = i/10%10;
            //获取百位
            int baiWei = i/10/10%10;
            //获取千位
            int qianWei = i/10/10/10%10;
            //获取万位
            int wanWei = i/10/10/10/10%10;

            if(geWei==wanWei && shiWei==qianWei && geWei+shiWei+qianWei+wanWei==baiWei){
                System.out.println(i);
            }
        }

    }

}
