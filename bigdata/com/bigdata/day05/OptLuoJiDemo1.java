package com.bigdata.day05;

/*
        逻辑运算符：
            &，|，&&，||，^,！

        特点：
            逻辑运算符两边一般是boolean类型的数据或者是表达式。

            表达式：
                就是用运算符把常量和变量连接起来并且符合java语法的式子，叫表达式

                算术运算符：a + b
                关系运算符：a == b
                赋值运算符：a = b


           总结：
                &：有false则false
                |：有true则true
                ^：两边相同为false,不同为true
                !：将结果反转，true变成false，false变成true


 */
public class OptLuoJiDemo1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

//        //&逻辑与运算
//        System.out.println((a>c) & (a>b)); // false & false = false
//        System.out.println((a>b) & (a<c)); // false & true = false
//        System.out.println((a<b) & (a>c)); // true & false = false
//        System.out.println((a<b) & (a<c)); // true & true = true
//
//        //|逻辑或运算
//        System.out.println((a>c) | (a>b)); // false | false = false
//        System.out.println((a>b) | (a<c)); // false | true = true
//        System.out.println((a<b) | (a>c)); // true | false = true
//        System.out.println((a<b) | (a<c)); // true | true = true
//
//        //^逻辑异或运算
//        System.out.println((a>c) ^ (a>b)); // false ^ false = false
//        System.out.println((a>b) ^ (a<c)); // false ^ true = true
//        System.out.println((a<b) ^ (a>c)); // true ^ false = true
//        System.out.println((a<b) ^ (a<c)); // true ^ true = false

        //!逻辑非运算
        System.out.println(!((a<b) ^ (a>c))); // true ^ false = true

        System.out.println(!((a<b) ^ (a<c))); // true ^ true = false


    }
}
