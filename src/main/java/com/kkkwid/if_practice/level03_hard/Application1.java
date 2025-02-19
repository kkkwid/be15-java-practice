package com.kkkwid.if_practice.level03_hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수 : ");
        int num2 = sc.nextInt();
        System.out.print("연산 기호를 입력하세요 : ");
        char po =  sc.next().charAt(0);

        if(po == '+'){
            System.out.println(num1+" "+po+" "+num2+ " = "+ (num1+num2) );
        }
        else if(po == '-'){
            System.out.println(num1+" "+po+" "+num2+ " = "+ (num1-num2) );
        }
        else if(po == '*'){
            System.out.println(num1+" "+po+" "+num2+ " = "+ (num1*num2) );
        }
        else if(po == '/'){
            System.out.println(num1+" "+po+" "+num2+ " = "+ (num1/num2) );
        }
        else if(po == '%'){
            System.out.println(num1+" "+po+" "+num2+ " = "+ (num1%num2) );
        }
        else {
            System.out.println("입력한 연산은 없다." );
        }
    }
}
