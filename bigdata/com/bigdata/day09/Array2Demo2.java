package com.bigdata.day09;

/*
    二维数组的定义格式2：
        数据类型[][] 变量名 = new 数据类型[m][];
        左边：
             数据类型：表示最终元素的数据类型
             [][]：表示是一个二维数组
             变量名：二维数组的名称
        右边：
            new：为二维数组开辟堆内存空间
            数据类型：表示的是最终元素的数据类型，每个一维数组中元素数据类型
            [m]：这个二维数据由m个一维数组组成
            []：这里暂时将每个一维数组中的元素个数写死，以将来传入的一维数组元素个数而定
        举例：
            int[][] arr = new int[3][]
*/

public class Array2Demo2 {
    public static void main(String[] args) {
        //使用第二种格式定义一个二维数组
        int[][] arr = new int[3][];
        int[][] arr0 = new int[1][];
        //表示的是定义了一个二维数组，由3个一维数组当作元素组成
        //只不过每一个一维数组的元素个数没有定
        //这里输出null的原因就是，这里的一位数组属于引用型数据类型
        System.out.println(arr); //输出的是二维数组本身的地址值
        System.out.println(arr[0]); //输出的是二维数组中第一个一维数组的地址值 null
        System.out.println(arr[1]); //输出的是二维数组中第二个一维数组的地址值 null
        System.out.println(arr[2]); //输出的是二维数组中第三个一维数组的地址值 null

        //java.lang.NullPointerException 空指针异常

//        System.out.println(arr[0][0]);

        //将二维数组中每一个元素添加一个一维数组
        //初始化一个元素个数为2个的一维数组，赋值给二维数组中第一个元素
        arr[0] = new int[2];
        //初始化一个元素个数为3个的一维数组，赋值给二维数组中第二个元素
        arr[1] = new int[3];
        //初始化一个元素个数为4个的一维数组，赋值给二维数组中第三个元素
        arr[2] = new int[4];

        System.out.println(arr); //输出的是二维数组本身的地址值
        System.out.println(arr[0]); //输出的是二维数组中第一个一维数组的地址值
        System.out.println(arr[1]); //输出的是二维数组中第二个一维数组的地址值
        System.out.println(arr[2]); //输出的是二维数组中第三个一维数组的地址值

        //获取二维数组中第二个一维数组中的第1个元素
        System.out.println(arr[1][0]);





    }
}
