package com.bigdata.day06;

/*
        请统计1-1000之间同时满足如下条件的数据有多少个：
            对3整除余2
            对5整除余3
            对7整除余2

        分析：
            1、定义一个变量统计个数 int num = 0;
            2、for循环获取1-1000的数据
            3、每次循环去判断该数据是否同时满足条件,如果满足，num+1
            4、输出num

 */
public class ForTest6 {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 2 && i % 5 == 3 && i % 7 == 2) {
                num = num + 1;
            }
        }
        System.out.println("1-1000同时满足条件个数为：" + num+" 个");
    }
}
