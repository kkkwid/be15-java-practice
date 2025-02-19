package com.kkkwid.if_practice.level04_advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================");
        System.out.print("월 급여 입력 : ");
        int month_salary = sc.nextInt();
        System.out.print("매출액 입력 : ");
        int take =  sc.nextInt();

        int bonus = 0;

        System.out.println("매출액 : "+take);
        if(take >= 50000000){
            bonus = 5;
            System.out.println("보너스율 : " +bonus+ "%" );
        }
        else if (take >= 30000000) {
            bonus = 3;
            System.out.println("보너스율 : " +bonus+ "%" );
        }
        else if (take >= 10000000) {
            bonus = 1;
            System.out.println("보너스율 : " +bonus+ "%" );
        }
        else{
            System.out.println("보너스율 : " +bonus+ "%" );
        }

        System.out.println("월 급여 : "+month_salary);
        System.out.println("보너스 금액 : " + take / bonus / 100);
        System.out.println("======================");
        System.out.println("총 급여 : "+(month_salary+(take/bonus/100)));


    }
}
