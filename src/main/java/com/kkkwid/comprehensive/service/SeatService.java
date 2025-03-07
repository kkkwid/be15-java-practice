package com.kkkwid.comprehensive.service;

import com.kkkwid.comprehensive.domain.Seat;
import com.kkkwid.comprehensive.persistence.SeatRepository;
import com.kkkwid.comprehensive.persistence.SeatFileRepository;
import java.util.List;

public class SeatService {
    private final SeatRepository seatRepository;

    public SeatService() {
        this.seatRepository = new SeatFileRepository();
    }

    public List<Seat> getSeatStatus() {
        return seatRepository.loadSeats();
    }

    public boolean reserveSeat(int seatNumber, String userId) {
        List<Seat> seats = seatRepository.loadSeats();
        for (Seat seat : seats) {
            if (seat.isOccupied() && seat.getUserId().equals(userId)) {
                System.out.println("이미 다른 좌석을 예약한 사용자입니다.");
                return false;
            }
        }

        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                if (seat.isOccupied()) {
                    System.out.println("해당 좌석은 이미 사용 중입니다.");
                    return false;
                }
                   seatRepository.updateSeatStatus(seatNumber, true, userId);
                return true;
            }
        }
        System.out.println("해당 좌석 번호는 존재하지 않습니다.");
        return false;
    }

    public boolean isUserAlreadyCheckedIn(String userId) {
        List<Seat> seats = seatRepository.loadSeats();
        for (Seat seat : seats) {
            if (seat.isOccupied() && seat.getUserId().equals(userId)) {
                return true;
            }
        }
        return false;
    }

    public boolean releaseSeat(int seatNumber, String userId) {
        List<Seat> seats = seatRepository.loadSeats();
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                if (!seat.isOccupied() || !seat.getUserId().equals(userId)) {
                    return false;
                }
                seatRepository.updateSeatStatus(seatNumber, false, "");
                return true;
            }
        }
        return false;
    }
}

