package com.bigdata.day08.homeworkday08;

/*
        4.某个公司采用公用电话传递数据，数据是四位的整数，
        在传递过程中是加密的，加密规则如下：
        每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，
        第二位和第三位交换。结果如图所示。

        1357

        第一步：6802
        第二步：2086
 */
public class Test4 {
    public static void main(String[] args) {
        int num = 1357;

        int geWei = num%10;
        int shiWei = num/10%10;
        int baiWei = num/10/10%10;
        int qianWei = num/10/10/10%10;
        System.out.println("千位："+qianWei+",百位："+baiWei+",十位："+shiWei+",个位："+geWei);

        //每一位加上5然后对10进行取余
        geWei = (geWei+5)%10;
        shiWei = (shiWei+5)%10;
        baiWei = (baiWei+5)%10;
        qianWei = (qianWei+5)%10;

        //个位与千位做交换，十位与百位做交换
        //两数之间交换
        int tmp = geWei;
        geWei = qianWei;
        qianWei = tmp;

        //十位与百位做交换
        int tmp2 = shiWei;
        shiWei = baiWei;
        baiWei =tmp2;

        System.out.println(qianWei+""+baiWei+""+shiWei+""+geWei);



    }
}
