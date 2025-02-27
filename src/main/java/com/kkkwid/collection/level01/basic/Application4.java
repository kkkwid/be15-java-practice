package com.kkkwid.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> id = new LinkedHashSet<>();
        while(true){
            System.out.println("학생 ID 입력('exit' 입력 시 종료): ");
            String name =  br.readLine();
            if(name.equals("exit")){
                break;
            }
            if(id.contains(name)){
                System.out.println("이미 등록 된 ID입니다.");
            }
            else {
                id.add(name);
                System.out.println("ID가 추가 되었습니다.");
            }
        }
        System.out.println("모든 학생의 ID :" + id);
    }
}
//학생 ID 입력('exit' 입력 시 종료): hello
//ID가 추가 되었습니다.
//학생 ID 입력('exit' 입력 시 종료): java
//ID가 추가 되었습니다.
//학생 ID 입력('exit' 입력 시 종료): programmer
//ID가 추가 되었습니다.
//학생 ID 입력('exit' 입력 시 종료): java
//이미 등록 된 ID입니다.
//학생 ID 입력('exit' 입력 시 종료): exit
//모든 학생의 ID : [java, programmer, hello]