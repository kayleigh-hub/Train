package com.bigdata.day06;

/*
        switch选择结构：
            1、格式：
                switch(表达式){
                    case 常量1:
                        语句体1;
                        break;
                    case 常量2:
                        语句体;
                        break;
                    ...
                    case 常量n:
                        语句体n;
                        break;
                    default:
                        语句体n+1:
                        break;
                }

         解释分析结构：
            1、switch表达式的结果可以是哪些数据类型？(面试题)
                表达式的结果可以是：byte,short,int,char
                在JDK1.5以后可以是枚举类型
                在JDK1.7以后可以是String

            2、名词解释：
                case: 后面跟的是要和表达式进行比较的值(常量)，如果说匹配到了对应的case的值，
                    那么就执行相对应的语句体，而且这个语句的部分可以是一条语句，也可以是多条语句
                break: 表示中断的意思，结束的意思，可以结束switch语句
                default: 表示默认的意思，当表达式的值与所有的case的值都不匹配的时候，最后才执行
                    default中的语句体。（与if-else if...-else中最后else对应着去理解）

            3、执行流程：
                1、计算表达式的值
                2、拿着这个计算好的值与case相对应的值(常量)按照顺序从上往下依次进行比较，如果有相同
                    的值，就开始执行此位置的case中的语句体内容。
                3、当语句体的内容执行完毕后，会紧接执行break语句，执行break语句就代表着咱们这个
                    switch选择结构的结束(跳出switch选择)
                4、当第二步从上往下去匹配case的值的时候，如果没有匹配到相应的值，就会执行default
                    语句中语句体内容，最后跳出switch语句。


            案例：(假设只能消费与口袋一样多钱的东西，只能买一样)
                买饮料案例

                可乐 3
                旺仔牛奶 5
                红牛 6
                农夫山泉 2
                脉动 4

            用switch语句实现购物,键盘录入身上带了多少钱。


           注意事项：
                1、case后面的值不能有重复的
                2、default语句可以进行省略，一般情况下，不建议删除。
                3、case 后面紧跟着的只能是常量，或者常量之间的运算，不能是变量
                4、break语句可以省略，代码也不会报错，一般情况下，不建议省略，
                    如果你省略了，结果可能不是你想要的结果
                    当匹配到break语句省略的那个case的时候，首先会执行对应的语句体，然后从匹配
                    到的case一直运行到有break语句为止。
                5、default语句可以放在任意地方吗？
                    可以，因为我们的switch语句执行流程是严格按照先在所有的case中进行匹配，当所有
                    的case都不匹配的时候，最后再去执行default语句，这和你default语句写的顺序没有关系。



 */
import java.util.Scanner;
public class SwitchDemo1 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
//        int s = 20

        //可乐 3, 旺仔牛奶 5, 红牛 6, 农夫山泉 2, 脉动 4
        //雪碧 3
        //键盘录入说明我现在身上有多少钱
        System.out.println("您身上带了多少钱：");
        int money = sc.nextInt();

        switch (money){
            default:
                System.out.println("该超市没有对应价格的饮料，下次再来瞅瞅");
                break;
            case 3:
                System.out.println("购买可乐，欢迎下次光临！");
                break;
            case 5:
                System.out.println("购买旺仔牛奶，欢迎下次光临！");
                break;
            case 6:
                System.out.println("购买红牛，欢迎下次光临！");
                break;
            case 2:
                System.out.println("购买农夫山泉，欢迎下次光临！");
                break;
            case 4:
                System.out.println("购买农夫山泉，欢迎下次光临！");
                break;
//            case 3:
//                System.out.println("购买雪碧，欢迎下次光临！");
//                break;

        }


    }
}
