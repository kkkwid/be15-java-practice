package com.kkkwid.comprehensive.persistence;

import com.kkkwid.comprehensive.domain.Seat;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SeatFileRepository implements SeatRepository {
    private final String filePath = "src/main/java/com/kkkwid/comprehensive/db/seatDB.dat";

    @Override
    public void saveSeats(List<Seat> seats) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(seats);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Seat> loadSeats() {
        File file = new File(filePath);
        if (!file.exists() || file.length() == 0) {
            List<Seat> seats = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                seats.add(new Seat(i));
            }
            saveSeats(seats);
            return seats;
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<Seat>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public void updateSeatStatus(int seatNumber, boolean isOccupied, String userId) {
        List<Seat> seats = loadSeats();
        for (Seat seat : seats) {
            if (seat.getSeatNumber() == seatNumber) {
                if (isOccupied) {
                    seat.occupy(userId);
                } else {
                    seat.vacate();
                }
                break;
            }
        }
        saveSeats(seats);
    }
}

