package com.kkkwid.collection.level01.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> word = new TreeSet<>();

        while(true){
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String answer = br.readLine();
            if(answer.equals("exit")){
                break;
            }
            word.add(answer);
        }
        System.out.println("정렬 된 단어 : "+word);
    }
}
//단어 입력 ('exit' 입력 시 종료): 안녕
//단어 입력 ('exit' 입력 시 종료): java
//단어 입력 ('exit' 입력 시 종료): collection
//단어 입력 ('exit' 입력 시 종료): 프로그래밍
//단어 입력 ('exit' 입력 시 종료): exit
//정렬 된 단어 : [collection, java, 안녕, 프로그래밍]