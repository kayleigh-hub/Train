package com.bigdata.day08.homeworkday08;

/*

    6.从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
 */
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个十进制的数：");
        int number = sc.nextInt();

        //除2取余，直到商为0，余数反转
        //while循环实现

        String s = "";
        int yuShu = 0;
        while ((number/2)!=0){ //10,5,2,1,0
            yuShu = number%2;//0,0,1,0,1
            number = number/2;//10,5,2,1,0
            s = yuShu + s;

//            s += yuShu;
            if((number/2)==0){
                yuShu = number%2;//0,0,1,0,1
                number = number/2;//10,5,2,1,0
                s = yuShu + s;
            }
        }

        System.out.println(s); //10100

//        //给出一个十进制数
//        int num2 =number;
//        //转换
//        int num = num2;
//        String str="";
//        do{
//            //除以2得到商
//            int div = num/2;
//            //得到余数作为二进制位
//            int mod = num%2;
//            str = mod + str;
//            //商作为被除数
//            num = div;
//        }while(num!=0);//被除数不是零
//        //输出二进制数
//        System.out.println(num2+"------>"+str);


    }
}
