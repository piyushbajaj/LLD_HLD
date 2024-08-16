package LLD.UditTutorial.L6_BookMyShow.model;

import java.util.List;

import LLD.UditTutorial.L6_BookMyShow.exceptions.InvalidStateException;
import lombok.Getter;
import lombok.NonNull;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.model
 * <p>
 * User: piyushbajaj
 * Date: 15/04/23
 * Time: 6:46 pm
 */

@Getter
public class S6_Booking {
    private final String id;
    private final S5_Show show;
    private final List<S4_Seat> seatsBooked;
    private final String user;
    private BookingStatus bookingStatus;

    public S6_Booking(@NonNull final String id, @NonNull final S5_Show show, @NonNull final String user,
                      @NonNull final List<S4_Seat> seatsBooked) {
        this.id = id;
        this.show = show;
        this.seatsBooked = seatsBooked;
        this.user = user;
        this.bookingStatus = BookingStatus.Created;
    }

    public boolean isConfirmed() {
        return this.bookingStatus == BookingStatus.Confirmed;
    }

    public void confirmBooking() {
        if (this.bookingStatus != BookingStatus.Created) {
            throw new InvalidStateException();
        }

        this.bookingStatus = BookingStatus.Confirmed;
    }


    public void expireBooking() {
        if (this.bookingStatus != BookingStatus.Created) {
            throw new InvalidStateException();
        }

        this.bookingStatus = BookingStatus.Expired;
    }
}
