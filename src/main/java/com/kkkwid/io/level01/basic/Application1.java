package com.kkkwid.io.level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("파일 이름을 입력하세요 : ");
        String name = sc.nextLine();

        try(FileReader reader = new FileReader(name)){
            System.out.println("==== 파일 내용 출력 ====");
            int character;
            while((character = reader.read()) != -1){
                System.out.print((char)character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("오류 : 존재하지않는 파일");
        } catch (IOException e) {
            System.out.println("예기치 못한 오류");
        }

    }
}
