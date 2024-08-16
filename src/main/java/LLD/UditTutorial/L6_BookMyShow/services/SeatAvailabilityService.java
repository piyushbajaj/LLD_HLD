package LLD.UditTutorial.L6_BookMyShow.services;

import java.util.ArrayList;
import java.util.List;

import LLD.UditTutorial.L6_BookMyShow.model.S4_Seat;
import LLD.UditTutorial.L6_BookMyShow.model.S5_Show;
import LLD.UditTutorial.L6_BookMyShow.providers.SeatLockProvider;
import lombok.NonNull;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.services
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 2:24 pm
 */
public class SeatAvailabilityService {
    private final BookingService bookingService;
    private final SeatLockProvider seatLockProvider;

    public SeatAvailabilityService(@NonNull final BookingService bookingService,
                                   @NonNull final SeatLockProvider seatLockProvider) {
        this.bookingService = bookingService;
        this.seatLockProvider = seatLockProvider;
    }

    public List<S4_Seat> getAvailableSeats(@NonNull final S5_Show show) {
        final List<S4_Seat> allSeats = show.getScreen().getSeats();
        final List<S4_Seat> unavailableSeats = getUnavailableSeats(show);

        final List<S4_Seat> availableSeats = new ArrayList<>(allSeats);
        availableSeats.removeAll(unavailableSeats);
        return availableSeats;
    }

    private List<S4_Seat> getUnavailableSeats(@NonNull final S5_Show show) {
//        final List<S4_Seat> unavailableSeats = bookingService.getBookedSeats(show);
//        unavailableSeats.addAll(seatLockProvider.getLockedSeats(show));
//        return unavailableSeats;
        return null;
    }
}
