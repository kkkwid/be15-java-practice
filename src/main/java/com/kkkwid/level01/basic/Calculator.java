package com.kkkwid.level01.basic;

public class Calculator {


    public void checkMethod() {
        System.out.println("checkMethod 호출");
    }

    public int sum1to10(){
        int answer = 0;
        for(int i = 1; i <=10; i++){
            answer += i;
        }
        return answer;
    }

    public void checkMaxNumber(int a, int b){
        System.out.println("max = " + Math.max(a,b));
    }

    public int sumTwoNumber(int a, int b){
        return a + b;
    }

    public int minusTwoNumber(int a, int b){
        return a-b;
    }
}
