package com.kkkwid.if_practice.level03_hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("과일 이름을 입력하세요 : ");
        String fruit = sc.nextLine();
        switch (fruit) {
            case "바나나" -> System.out.println(fruit + "의 가격은 3000원 입니다.");
            case "사과" -> System.out.println(fruit + "의 가격은 1000원 입니다.");
            case "복숭아" -> System.out.println(fruit + "의 가격은 2000원 입니다.");
            case "키위" -> System.out.println(fruit + "의 가격은 5000원 입니다.");
            default -> System.out.println("준비된 상품이 없습니다.");
        }

    }
}
