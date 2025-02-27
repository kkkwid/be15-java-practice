package com.kkkwid.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Application6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<String, String> map = new HashMap<>();
        while(true){
            System.out.println("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'):");
            st = new  StringTokenizer(br.readLine());
            String name  = st.nextToken();
            if(name.equals("exit")){
                break;
            }
            else if(name.equals("search")){
                System.out.println("검색 할 이름 : ");
                String search = br.readLine();
                if(map.containsKey(search)){
                    System.out.println(search+"씨의 전화번호 :" +map.get(search));
                }
                else{
                    System.out.println(search+"씨의 번호는 등록 되어 있지 않습니다.");
                }
            }
            else {
                String number = st.nextToken();
                map.put(name,number);
                System.out.println("추가 완료 : "+name+" "+map.get(name));
            }
        }
    }
}

//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동010-1234-5678
//입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동 010-1234-5678
//추가 완료 : 홍길동 010-1234-5678
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 유관순 010-9876-5432
//추가 완료 : 유관순 010-9876-5432
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
//검색 할 이름 : 유관순
//유관순씨의 전화번호 : 010-9876-5432
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
//검색 할 이름 : 이순신
//이순신씨의 번호는 등록 되어 있지 않습니다.
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): exit