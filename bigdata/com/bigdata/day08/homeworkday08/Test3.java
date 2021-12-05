package com.bigdata.day08.homeworkday08;

/*
        银行利率表如下表所示，请计算存款10000元，
        活期1年、活期2年，定期1年，定期2年后的本息合计。

        活期存款              0.35%
        三个月定期存款        1.1%
        半年定期存款          1.3%
        一年定期存款          1.5%
        两年定期存款          2.1%
 */
public class Test3 {
    public static void main(String[] args) {
        double benJin = 10000.0;

        //活期一年
        double benXi1 = benJin + benJin * 0.0035;
        System.out.println("活期一年:" + benXi1);

        //活期两年
        double benXi2 = benXi1 + benXi1 * 0.0035;
        System.out.println("活期两年:" + benXi2);

        //定期一年
        double benXi3 = benJin + benJin * 0.015;
        System.out.println("定期一年:" + benXi3);

        //定期两年
        double benXi4 = benJin + benJin * 0.021;
        double benXi5 = benXi4 + benXi4 * 0.021;
        System.out.println("定期两年:" + benXi5);


    }
}
