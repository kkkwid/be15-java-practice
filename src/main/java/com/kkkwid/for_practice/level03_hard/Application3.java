package com.kkkwid.for_practice.level03_hard;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        int count = 0;

        String comment ="영문자가 아닌 문자가 포함되어 있습니다";

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                System.out.println(comment);
                return;
            }
        }

        System.out.print("문자 입력 : ");
        char ch  = sc.next().charAt(0);

        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("포함된 갯수 : " + count + "개");
    }

}
