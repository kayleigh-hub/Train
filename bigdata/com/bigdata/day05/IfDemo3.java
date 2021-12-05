package com.bigdata.day05;

/*
        if语句的第二种格式与三目运算符的关系

    注意事项：
        1、当if-else格式中的语句体一条输出语句的时候，不能转换成三目运算符
        2、当if-else格式中的语句体不是一条的时候，也不能转换成三目运算符
 */
public class IfDemo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int res1 = (a > b)?a:b;
        System.out.println(res1);

        if(a > b){
            res1 = a;
            a++;
        }else {
            res1 = b;
            b++;
        }
//        System.out.println(res1);

//        int res2 = (a > b)?res1=a;a++;:res1=b;b++;


//        if(a < b){
//            System.out.println("a比b小");
//        }else {
//            System.out.println("a比b大或者相等");
//        }


//        (a < b)?System.out.println("a比b小"):System.out.println("a比b大或者相等");

    }
}
