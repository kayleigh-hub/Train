package com.bigdata.day12;
/*

    定义一个类Demo,其中定义一个求两个数据和的方法，定义一个测试了Test，进行测试。
 */

class Demo {
    //第一种方式：
//    public int sum() {
//        int a = 11;
//        int b = 22;
//        int c = a + b;
//        return c;
//    }


    //第二种方式：
    //通过第一种方式实现了我们题目的需求
    //但是不好，因为加法的数值写固定了，所以不好
    //改进：可以将来传两个值进来
    public int sum(int x, int y) {
        return x + y;
    }

    //第二种方式对然相比较于第一种方式来说，虽然我们可以进行手动传入参数，但是
    //实现的过程并没有用到面向对象的封装的知识
    //我们可以尝试将两个参数定义为成员变量

    //第三种方式：
//    private int a;
//    private int b;
//
//    public int sum(int a,int b){
//        this.a = a;
//        this.b = b;
//        return (this.a+this.b);
//    }

    //问题：哪一种方式实现该问题的最优解？
    //其实，我们在面对业务问题的时候，什么时候考虑使用面向对象的思想
    //或者换句话说，什么情况下，将我们问题中的参数定义成成员变量呢？
    //只有当我们题目中参数与该类形成属性和行为的关系的时候，才定义成成员变量
    //因为类是用来描述现实世界事物的，
    //所以也就说成员变量是用来描述类
    //所以，这道题，第二种方式是最优解。





}

public class Test1 {
    public static void main(String[] args) {
        //创建对象
        Demo d = new Demo();
        int sum = d.sum(65,70);
        System.out.println(sum);

    }

}
