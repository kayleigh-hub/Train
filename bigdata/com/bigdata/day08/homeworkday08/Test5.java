package com.bigdata.day08.homeworkday08;

/*
        2.利用”异或”运算的性质,对几个字符进行加密并输出密文,然后再解密。
        加密算法是：密钥是字符’8’，明文的每个字符和密钥进行异或运算，得到密文。
        密钥和密文的每个字符再次进行异或运算，重新得到明文。结果如图所示。
 */
public class Test5 {
    public static void main(String[] args) {
        char c1 = '十';
        char c2 = '点';
        char c3 = '进';
        char c4 = '攻';
        System.out.println("加密前原文："+c1+""+c2+""+c3+""+c4);

        c1 = (char)(c1^'8');
        c2 = (char)(c2^'8');
        c3 = (char)(c3^'8');
        c4 = (char)(c4^'8');
        System.out.println("密文："+c1+""+c2+""+c3+""+c4);

        c1 = (char)(c1^'8');
        c2 = (char)(c2^'8');
        c3 = (char)(c3^'8');
        c4 = (char)(c4^'8');
        System.out.println("解密后原文："+c1+""+c2+""+c3+""+c4);





    }
}
