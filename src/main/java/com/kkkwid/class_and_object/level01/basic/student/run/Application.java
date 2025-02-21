package com.kkkwid.class_and_object.level01.basic.student.run;

import com.kkkwid.class_and_object.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int count = 0;
        StudentDTO[] students = new StudentDTO[10];

        while(count < 10){
            students[count] = new StudentDTO();

            Scanner sc = new Scanner(System.in);
            System.out.print("학년 : ");
            students[count].setGrade(sc.nextInt());

            System.out.print("반 : ");
            students[count].setClassroom(sc.nextInt());

            System.out.print("이름 : ");
            students[count].setName(sc.next());

            System.out.print("국어점수 : ");
            students[count].setKor(sc.nextInt());

            System.out.print("영어점수 : ");
            students[count].setEng(sc.nextInt());

            System.out.print("수학점수 : ");
            students[count].setMath(sc.nextInt());

            System.out.println("계속 추가할 겁니까 ? (y/n)");
            char ch = sc.next().charAt(0);

            if(ch == 'n'){
                break;
            }
            count++;
        }
        for(int i = 0; students[i]!= null; i++){
            System.out.println(students[i].getInformation());
        }


    }
}
