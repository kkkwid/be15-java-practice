package com.kkkwid.exception.level.basic;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            LocalDate dateNow = LocalDate.now();

            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String date = sc.nextLine();
            LocalDate localDate = LocalDate.parse(date);

            Period period = Period.between(localDate, dateNow);


            if (period.getYears() > 20) {
                System.out.println("입장하셔도 됩니다.");
            } else {
                System.out.println("만 20세 미만은 입장 불가입니다.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        }

    }
}
