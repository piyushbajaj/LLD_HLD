package LLD.UditTutorial.L6_BookMyShow.api;

import java.util.List;

import LLD.UditTutorial.L6_BookMyShow.model.S4_Seat;
import LLD.UditTutorial.L6_BookMyShow.model.S5_Show;
import LLD.UditTutorial.L6_BookMyShow.services.BookingService;
import LLD.UditTutorial.L6_BookMyShow.services.ShowService;
import LLD.UditTutorial.L6_BookMyShow.services.TheatreService;
import lombok.AllArgsConstructor;
import lombok.NonNull;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.api
 * <p>
 * User: piyushbajaj
 * Date: 15/04/23
 * Time: 7:44 pm
 */

@AllArgsConstructor
public class S4_BookingController {
    private final ShowService showService;
    private final BookingService bookingService;
    private final TheatreService theatreService;

    public String createBooking(@NonNull final String userId, @NonNull final String showId,
                                @NonNull final List<String> seatIds) {
        final S5_Show show = showService.getShow(showId);
        final List<S4_Seat> seats = seatIds.stream().map(theatreService::getSeat).toList();

//        return bookingService.createBooking(userId, show, seats).getId();

        return "";
    }
}
