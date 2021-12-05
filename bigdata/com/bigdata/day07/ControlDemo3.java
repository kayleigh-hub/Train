package com.bigdata.day07;

/*
    continue: 跳出当次循环

    使用场景：
        1、在循环语句中
        2、离开使用场景的存在是没有意义的

    return: 返回，退还
        在main方法中使用，就相当于结束了main方法，也就是结束当前java程序


 */
public class ControlDemo3 {
    public static void main(String[] args) {
        //单独使用报错，根据报错信息我们发现，continue只能在循环中使用
//        continue;
        //需求：打印1-10，加入continue关键字，在打印3的时候加入
        System.out.println("=====加continue==============");
        for(int i=1;i<=10;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }


        System.out.println("=====加break==============");
        for(int i=1;i<=10;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("=====加入return===============");

        for(int i=1;i<=10;i++){
            if(i==3){
                return;
            }
            System.out.println(i);
        }

        //可以单独使用
//        return;

        System.out.println("你好呀 大家");




    }
}
