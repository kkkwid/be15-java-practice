package com.kkkwid.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Application3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> name = new LinkedList<>();
        while(true){
            System.out.println("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String user =  br.readLine();
            if(user.equals("next")){
                if(name.isEmpty()){
                    System.out.println("대기 고객이 없습니다.");
                }
                else {
                    System.out.println(name.poll()+ " 고객님 차례입니다.");
                }
            }
            else if(user.equals("exit")){ break; }

            else {
                name.offer(user);
                System.out.println(user+ " 고객님 대기 등록 되었습니다.");
                }

        }
    }
}
