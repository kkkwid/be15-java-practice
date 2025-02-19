package com.kkkwid.if_practice.level02_normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("신장 : ");
        double m = sc.nextDouble();
        System.out.print("체중 : ");
        int k = sc.nextInt();

        double bmi = k / Math.pow(m,2);

        if(bmi < 20){
            System.out.println("당신은 저체중");
        }
        else if (bmi>=20  && bmi<25){
            System.out.println("당신은 정상체중");
        }
        else if (bmi>=25 && bmi<30){
            System.out.println("당신은 과체중");
        }
        else {
            System.out.println("당신은 비만");
        }
    }
}
