package com.kkkwid.for_practice.level04_advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        while(num > 26){
            num -= 26;
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    if( (char)(str.charAt(i) + num) >'z'){
                        System.out.print(" "+(char)(str.charAt(i) + num - 26));
                    }
                    else{
                        System.out.print(" "+(char)(str.charAt(i) + num));
                    }
                }
                else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                    if( (char)(str.charAt(i) + num) >'Z'){
                        System.out.print(" "+(char)(str.charAt(i) + num - 26));
                    }
                    else{
                        System.out.print(" "+(char)(str.charAt(i) + num));
                    }
                }
            }
        }
    }
}
