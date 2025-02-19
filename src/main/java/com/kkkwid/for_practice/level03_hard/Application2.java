package com.kkkwid.for_practice.level03_hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = 1;

        int num = 0;
        int count = 1;
        while (random != num) {
            random = (int) (Math.random() * 100) + 1;
            System.out.print("정수를 입력하세요 : ");
            num = sc.nextInt();
            if (random == num) {
                System.out.println("정답입니다."+count+"회만에 정답을 맞추셨습니다.");
            }
            else if(random > num){
                System.out.println("입력하신 정수보다 큽니다.");
            }
            else{
                System.out.println("입력하신 정수보다 작습니다.");
            }
            count ++;

        }
    }
}
