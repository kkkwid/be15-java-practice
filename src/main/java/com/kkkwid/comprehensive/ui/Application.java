package com.kkkwid.comprehensive.ui;

import com.kkkwid.comprehensive.domain.Seat;
import com.kkkwid.comprehensive.domain.User;
import com.kkkwid.comprehensive.service.UserService;
import com.kkkwid.comprehensive.service.SeatService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Application {
    private static final UserService userService = new UserService();
    private static final SeatService seatService = new SeatService();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static User currentUser = null;

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("독서실 회원이신가요? (Y/N) : ");
            char choice = br.readLine().charAt(0);

            if (choice == 'N' || choice == 'n') {
                registerUser();
                loginUser();
                break;
            } else if (choice == 'Y' || choice == 'y') {
                loginUser();
                break;
            } else {
                System.out.println("Y 또는 N만 입력해주세요.");
            }

            if (currentUser != null) {
                break;
            }
        }

        while (true) {
            System.out.println("==== 메뉴 선택 ====");
            System.out.println("1. 입실하기");
            System.out.println("2. 자리현황 확인");
            System.out.println("3. 퇴실하기");
            System.out.println("4. 회원탈퇴");
            System.out.println("9. 시스템 종료");
            System.out.print("번호 입력 : ");

            try {
                int choiceNumber = Integer.parseInt(br.readLine());
                switch (choiceNumber) {
                    case 1 -> checkIn(); // 입실
                    case 2 -> showSeatStatus(); // 좌석현황
                    case 3 -> checkOut(); // 퇴실
                    case 4 -> removeUser(); // 회원탈퇴
                    case 9 -> {
                        System.out.println("시스템을 종료합니다.");
                        return;
                    }
                    default -> System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
            }
        }
    }

    private static void registerUser() throws IOException {
        System.out.print("이름: ");
        String name = br.readLine();
        System.out.print("아이디: ");
        String id = br.readLine();
        System.out.print("비밀번호: ");
        String password = br.readLine();
        System.out.print("핸드폰 번호: ");
        String phoneNumber = br.readLine();
        System.out.print("나이: ");
        int age = Integer.parseInt(br.readLine());

        try {
            userService.registerUser(name, id, password, phoneNumber, age);
            System.out.println("회원가입이 완료되었습니다");
        } catch (IllegalArgumentException e) {
            System.out.println("회원가입 실패: " + e.getMessage());
        }
    }

    private static void loginUser() throws IOException {
        System.out.print("아이디: ");
        String id = br.readLine();
        User user = userService.findUserById(id);

        if (user != null) {
            System.out.print("비밀번호: ");
            String password = br.readLine();
            if (user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("로그인 성공");
            } else {
                System.out.println("비밀번호가 틀렸습니다.");
            }
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
            System.exit(0);
        }
    }


    private static void checkIn() throws IOException {
        showSeatStatus();
        System.out.print("입실할 좌석 번호 입력: ");
        int seatNumber = Integer.parseInt(br.readLine());

        if (seatService.isUserAlreadyCheckedIn(currentUser.getId())) {
            System.out.println("이미 다른 좌석을 예약한 사용자입니다.");
            return;
        }

        if (seatService.reserveSeat(seatNumber, currentUser.getId())) {
            System.out.println("입실 완료 좌석 번호: " + seatNumber);
        } else {
            System.out.println("해당 좌석은 이미 사용 중입니다.");
        }
    }

    private static void showSeatStatus() {
        List<Seat> seats = seatService.getSeatStatus();
        System.out.println("==== 좌석 현황 ====");
        for (Seat seat : seats) {
            String status = seat.isOccupied() ? "사용 중 (ID: " + seat.getUserId() + ")" : "비어 있음";
            System.out.println("좌석 " + seat.getSeatNumber() + ": " + status);
        }
    }

    private static void checkOut() throws IOException {
        System.out.print("퇴실할 좌석 번호 입력: ");
        int seatNumber = Integer.parseInt(br.readLine());

        if (seatService.releaseSeat(seatNumber, currentUser.getId())) {
            System.out.println("퇴실 처리되었습니다. ");
        } else {
            System.out.println("좌석이 비어있거나 본인의 좌석이 아닙니다.");
        }

        showSeatStatus();
    }

    private static void removeUser() throws IOException {
        System.out.print("탈퇴할 아이디 입력: ");
        String id = br.readLine();
        System.out.print("비밀번호 입력: ");
        String password = br.readLine();

        userService.removeUser(id, password);
        System.out.println("회원 탈퇴되었습니다.");
    }
}
