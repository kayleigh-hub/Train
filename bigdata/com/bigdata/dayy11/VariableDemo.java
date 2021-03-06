package com.bigdata.dayy11;

/*

        成员变量与局部变量的区别：
            1、在类中的位置不同
                 成员变量 类中方法外
                 局部变量 方法内或者方法声明上
            2、在内存中的位置不同
                 成员变量 堆内存:
                    随着对象在堆内存中的创建而出现，所以成员变量是在堆内存中出现
                 局部变量 栈内存:
                    由于方法执行是在栈中执行，所以在方法中定义的局部变量
                    也就是存在与栈里。
            3、生命周期不同
                成员变量 随着对象的创建而存在，随着对象的消失而消失
                局部变量 随着方法的调用而存在，随着方法的调用完毕而消失
            4、初始化值不同
                成员变量 有默认的初始化值
                    原因：由于成员变量随着对象的创建而存在，而对象的创建
                        是在堆内存中创建，而我们又知道堆内存中的变量创建的时候
                        系统会给予默认值，所以我们在代码中定义的时候可以不赋值。
                局部变量 没有默认的初始化值，必须先定义，赋值，才能使用。
                    原因：由于局部变量随着方法的调用而存在，是在栈里面调用的。
                        而我们知道栈里面的变量系统不会给予默认值，所以我们在代码
                        中定义的时候必须要赋值。

           问题：
                1、成员变量的名称可以和局部变量的名称一样吗？
                    可以，调用的时候，访问的变量遵循就近原则。

                2、方法与方法之间的局部变量可以互相访问吗？
                    不可以，因为作用域的范围不同。





 */
class VariableDemo {
    //直接在类中定义的叫成员变量
    int a;

    public static void main(String[] args) {
        //在方法里面定义的叫局部变量
        int a = 20;
        System.out.println(a);
    }

    public void function1(){
        int x = 20;
    }

    public void function2(){
        int y = 30;
//        System.out.println(x);
    }

}
