package com.kkkwid.array.level02_normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요 : ");
        String str =  sc.nextLine();
        String answer = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(i>7){
                ch = '*';
            }
            answer += ch;
        }
        System.out.println(answer);
    }
}
