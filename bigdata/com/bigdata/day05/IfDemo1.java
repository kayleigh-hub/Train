package com.bigdata.day05;

/*
        选择结构中的if语句：
            格式：
                1、  if(关系表达式){
                        如果关系表达式的结果是true，执行大括号中的语句
                        如果关系表达式的结果是false，就跳过不执行
                    }
            执行流程：
                首先判断关系表达式看其结果是true还是false
                如果是true就执行语句体
                如果是false就不执行语句体

            注意事项：
                1、如果在关系表达式小括号后面加上了一个分号，说明if语句结束
                    默认存在一个空语句体
                2、括号都是成双成对出现的
                3、小括号中的结果必须是布尔类型（boolean类型）

 */
public class IfDemo1 {
    public static void main(String[] args) {
        System.out.println("程序开始执行");
        int a = 12;

        if(a == 10) {
            System.out.println("a的值是10");
        }

//        if(a++){
//
//        }

        System.out.println("over");


    }
}
