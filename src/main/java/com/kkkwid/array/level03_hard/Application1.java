package com.kkkwid.array.level03_hard;

import java.util.Arrays;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if( n % 2 == 1 ){
            for(int i = 0; i < n; i++){
                arr[i] = i+1;
                if(i > n/2){
                    arr[i] = arr[n-i-1];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
