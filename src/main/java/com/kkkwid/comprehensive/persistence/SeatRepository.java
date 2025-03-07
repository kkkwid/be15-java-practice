package com.kkkwid.comprehensive.persistence;

import com.kkkwid.comprehensive.domain.Seat;
import java.util.List;

public interface SeatRepository {
    void saveSeats(List<Seat> seats);
    List<Seat> loadSeats();
    void updateSeatStatus(int seatNumber, boolean isOccupied, String userId);
}

