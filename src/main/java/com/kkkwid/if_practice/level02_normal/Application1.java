package com.kkkwid.if_practice.level02_normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();


        if(num<1 || num>10){
            System.out.println("1~10 사이의 정수를 입력하세요");
        }
        else if (num % 2 == 0) {
            System.out.println(num + "은 짝수다.");
        }
        else if (num % 2 == 1) {
            System.out.println(num + "은 홀수다.");
        }
    }
}
