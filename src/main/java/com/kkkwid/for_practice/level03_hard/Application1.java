package com.kkkwid.for_practice.level03_hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if(num<2){
            System.out.println("잘못입력");
        }

        else if(num/2 != 0 && num/3 != 0){
            System.out.println("소수");
        }

        else{
            System.out.println("소수가 아니다");
        }



    }
}
