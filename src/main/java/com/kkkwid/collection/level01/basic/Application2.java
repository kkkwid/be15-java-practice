package com.kkkwid.collection.level01.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Application2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> url = new LinkedList<>();
        while(true){
            System.out.println("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            url.push(br.readLine());
            if(url.peek().equals("exit")){
                break;
            }

            System.out.println("최근 방문 url : "+url);
        }
    }
}
