package com.bigdata.day07;

/*
        报错修改快捷键：将鼠标光标移动至报错的横线上，按下alt+enter

        需求：
            九九乘法表，在内循环j是4的时候，我们break一下

        注意事项：
            单层跳出：在当前for循环中使用break,只结束当前for循环
            多层跳出：带标签的break,格式：标签名 : 循环语句（开发中如果没有特殊需求，一般不会去使用）

 */
public class ControlDemo2 {
    public static void main(String[] args) {

        System.out.println("========九九乘法表===========");
//        for(int i=1;i<=9;i++){
//            for(int j = 1;j<=i-1;j++){
//                System.out.print("\t");
//                System.out.print("\t");
//            }
//
//            for(int j=i;j==i;j++){
//                System.out.print(j+"*"+i+"="+(i*j)+"\t");
//            }
//            System.out.println();
//        }

        //在内循环j是4的时候，我们break一下
        xiaomi : for(int i=1;i<=9;i++){ //外层控制行
            xiaoyun : for(int j=1;j<=i;j++){ //内层控制列
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
                if(j==4){
                    break xiaomi; //结束当前循环
                }
            }
            System.out.println();
        }


    }
}
