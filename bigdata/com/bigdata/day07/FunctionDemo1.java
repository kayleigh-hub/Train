package com.bigdata.day07;

/*
        方法：
            简单的说：方法就是完成特定功能的代码块
            在很多语言里面都有函数的定义
            函数在Java中被称为方法
        语句格式：
        修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2…) {
			修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2…) {
			函数体;
			return 返回值;
    }

			return 返回值;
        }

        名词解释：
            修饰符：修饰符比较多，但是目前我们只需要记住一个组合public static
                后面面向对象的时候，我们详细介绍有哪些修饰符，怎么去写。

            返回值类型：
                定义return返回值的数据类型。

            方法名：给这个方法起个名字（符合标识符的命名规则）

            参数：
                1、形参
                    定义在方法上面的参数名
                2、实参
                    将来实际调用方法传入的值，叫实参
            参数类型：
                限定将来调用方法需要传入参数的数据类型
            参数名：（形参）
                是一个变量，用于接收将来调用方法传入的参数，名字见名之意
            函数体：
                完成方法功能的代码，实现主要的方法逻辑
            return:
                一般情况下，有返回值的方法，才会有return，return的作用是将计算好的
                结果返回给调用者，返回的类型是与方法定义的返回值类型一致
            返回值：
                程序被return带回的结果，返回给调用者

 */
public class FunctionDemo1 {
    public static void main(String[] args) {
        //需求，计算两个int类型的数之和
        int a = 10;
        int b = 20;
//        int result = a + b;
//        System.out.println("两数之和为：" + result);
        /**
         *  有返回值的方法调用的时候，有两种处理方式
         *      1、定义一个变量，数据类型与方法返回的数据类型一致，
         *          接收方法返回的值（推荐）
         *      2、直接使用
         */
        int res = sum(a,b);
        System.out.println(res);
//        System.out.println(sum(a,b));


        //注意：方法与方法之间是平级关系，不能嵌套定义
//        public static int sum ( int x1, int x2){
//            return x1 + x2;
//        }


        //100行
        int res2 = sum(50,50);
        System.out.println(res2);

        sum(40,70);

    }

    public static int sum(int x1,int x2){
        int result = x1+x2;
        return result;
    }
}
