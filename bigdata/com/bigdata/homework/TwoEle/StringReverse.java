package com.bigdata.homework.TwoEle;
/*
给我一个字符串，例如i love mm ，输出：mm love i；
 */
//public class StringReverse {
//    public  void swap(char[] arr ,int begin,int end){
//        while(begin < end){
//            char temp = arr[begin];
//            arr[begin] = arr[begin];
//            arr[end] = temp;
//            begin++;
//            end--;
//        }
//    }
//    public String swapWords(String str){
//        char[] arr = str.toCharArray();
//        swap(arr,0,arr.length-1);
//        int begin = 0;
//        for(int i = 1;i < arr.length;i++){
//            if(arr[i] == ' '){
//                swap(arr,begin,i-1);
//                begin = i + 1;
//            }
//        }
//        swap(arr,begin,arr.length);
//        return new String(arr);
//    }
//
//    public static void main(String[] args) {
//        String str = "i love mm";
//        System.out.println(new StringReverse().swapWords(str));
//    }
//
//}


public class StringReverse {

    public void swap(char[] arr, int begin, int end) {
        while(begin < end) {
            char temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
    }
    //I love java
    public String swapWords(String str) {
        char[] arr = str.toCharArray();
        swap(arr, 0, arr.length - 1);
        int begin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == ' ') {
                swap(arr, begin, i - 1);
                begin = i + 1;
            }
        }
        swap(arr, begin, arr.length-1);
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "I love java";
        System.out.println(new StringReverse().swapWords(str));
    }

}

























