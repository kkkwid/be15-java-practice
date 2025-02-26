package com.kkkwid.io.level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String origin = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String copy = sc.nextLine();

        try(FileReader fr = new FileReader(origin);
            FileWriter fw = new FileWriter(copy))  {
            int character;
            while ((character = fr.read()) != -1) {
                fw.write(character);
            }
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println("오류 : " +e.getMessage());
        }
    }
}
