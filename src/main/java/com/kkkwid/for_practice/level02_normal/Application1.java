package com.kkkwid.for_practice.level02_normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str =  sc.nextLine();
        for(int i=0;i<str.length();i++){
            System.out.println(i+" : " +str.charAt(i));
        }
    }
}
