package com.bigdata.day06;

/*
        while循环与for循环的区别

            1、for循环结束后，在for循环中定义的初始化变量在外部无法使用
                while循环结束后，由于初始化值变量是在while循环外部定义的，所以
                在while循环外部可以访问到。
            2、

        举例：
            1、打印1-10
            2、假设学习java,每天学一点，你不知道多少天学完，但是总有一天会学完
                这时候，就不能用for循环了。
                我们改用while循环。
                for循环实现的是一个范围内的循环
                while循环，不知道将来要循环多少次，但是总会有个点去停止。
            3、每分钟监控某网页登录用户的情况，直到有非法用户登录，统计在此之前的次数

                boolean  flag = true;
                while(flag){
                    if(非法用户登录){
                        flag = false;
                    }
                }



 */
public class WhileDemo2 {
    public static void main(String[] args) {
        System.out.println("for循环实现");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

//        System.out.println(i);
        System.out.println("while循环实现");
        int i1 = 1;
        while (i1<=10){
            System.out.println(i1);
            i1++;
        }

        System.out.println(i1);

    }
}
