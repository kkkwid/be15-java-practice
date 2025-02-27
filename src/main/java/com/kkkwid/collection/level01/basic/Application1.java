package com.kkkwid.collection.level01.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> grade =  new ArrayList<>();

        while(true){
            System.out.print("학생 성적 : ");
            grade.add(Double.parseDouble(br.readLine()));
            System.out.print("추가 입력하려면 y : ");
            char answer = br.readLine().charAt(0);
            if(answer == 'Y' || answer == 'y'){
                continue;
            }
            else {
                break;
            }
        }
        double sum = 0;
        for (Double v : grade) {
            sum += v;
        }
        System.out.println("학생 인원 : "+grade.size());
        System.out.println("평균 점수 : "+ sum/grade.size());
    }
}
