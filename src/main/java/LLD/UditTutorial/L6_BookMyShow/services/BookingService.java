package LLD.UditTutorial.L6_BookMyShow.services;

import java.util.HashMap;
import java.util.Map;

import LLD.UditTutorial.L6_BookMyShow.model.S6_Booking;
import LLD.UditTutorial.L6_BookMyShow.providers.SeatLockProvider;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.services
 * <p>
 * User: piyushbajaj
 * Date: 15/04/23
 * Time: 8:06 pm
 */
public class BookingService {

    private final Map<String, S6_Booking> showBookings;
    private final SeatLockProvider seatLockProvider;

    public BookingService(SeatLockProvider seatLockProvider) {
        this.showBookings = new HashMap<>();
        this.seatLockProvider = seatLockProvider;
    }
}
