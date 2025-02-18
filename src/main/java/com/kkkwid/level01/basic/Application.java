package com.kkkwid.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.checkMethod();

        System.out.println("1~10 합은 = " + calculator.sum1to10());

        calculator.checkMaxNumber(10,5);

        System.out.println("a+b = "+calculator.sumTwoNumber(10,5));
        System.out.println("a-b = "+calculator.minusTwoNumber(10,5));


    }
}
