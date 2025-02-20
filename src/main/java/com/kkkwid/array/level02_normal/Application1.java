package com.kkkwid.array.level02_normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String str =  sc.nextLine();
        System.out.print("검색할 문자를 입력하세요 : ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("입력하신 문자열 "+str+"에서 찾으시는 문자 "+ch+"은 "+count+"개 입니다.");
    }
}
