package com.kkkwid.generic.level01.normal;


public class Application2 {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + (double) sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
//         System.out.println("String 합계 : " + sum(strArray));  // 컴파일 에러 발생
    }

    public static <T extends Number> int sum(T[] a){
        int sum = 0;
        for (T t : a) {
            sum += t.intValue();
        }
        return sum;
    }
}