package com.kkkwid.array.level04_advanced;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        while(set.size()!=4){
            int num = (int)(Math.random()*10);
            set.add(num);
        }
        StringBuilder sb = new StringBuilder();
        for (int num : set) {
            sb.append(num);
        }

        String str = sb.toString();
        int count = 10;

        System.out.println(str);
        label:
        while(count != 0){
            System.out.println(count+"회 남으셨습니다.");
            System.out.println("4자리 숫자를 입력하세요 : ");
            String num = sc.next();
            if(num.length() != 4){
                System.out.println("숫자를 정확하게 입력하세요");
                continue label;
            }
            int scount = 0;
            int bcount = 0;

            if (str.charAt(0) == num.charAt(0)) {
                    scount++;
            }
            else if (str.charAt(0) == num.charAt(1)) {
                bcount++;
            }
            else if (str.charAt(0) == num.charAt(2)) {
                bcount++;
            }
            else if (str.charAt(0) == num.charAt(3)) {
                bcount++;
            }

            if (str.charAt(1) == num.charAt(0)) {
                bcount++;
            }
            else if (str.charAt(1) == num.charAt(1)) {
                scount++;
            }
            else if (str.charAt(1) == num.charAt(2)) {
                bcount++;
            }
            else if (str.charAt(1)== num.charAt(3)) {
                bcount++;
            }

            if (str.charAt(2) == num.charAt(0)) {
                scount++;
            }
            else if (str.charAt(2) == num.charAt(1)) {
                bcount++;
            }
            else if (str.charAt(2) == num.charAt(2)) {
                scount++;
            }
            else if (str.charAt(2) == num.charAt(3)) {
                bcount++;
            }

            if (str.charAt(3) == num.charAt(0)) {
                bcount++;
            }
            else if (str.charAt(3) == num.charAt(1)) {
                bcount++;
            }
            else if (str.charAt(3) == num.charAt(2)) {
                bcount++;
            }
            else if (str.charAt(3) == num.charAt(3)) {
                scount++;
            }

            if(scount == 4){
                System.out.println("정답입니다."); break;
            }
            System.out.println("아쉽네요"+scount+"S "+bcount+"B 입니다.");
            count--;

        }

    }
}
