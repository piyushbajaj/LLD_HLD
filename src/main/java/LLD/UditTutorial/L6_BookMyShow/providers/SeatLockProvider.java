package LLD.UditTutorial.L6_BookMyShow.providers;

import java.util.List;

import LLD.UditTutorial.L6_BookMyShow.model.S4_Seat;
import LLD.UditTutorial.L6_BookMyShow.model.S5_Show;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.providers
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 2:32 pm
 */
public interface SeatLockProvider {
    void lockSeats(S5_Show show, List<S4_Seat> seats, String user);

    void unlockSeats(S5_Show show, List<S4_Seat> seats, String user);

    boolean validateLock(S5_Show show, S4_Seat seat, String user);

    List<S4_Seat> getLockedSeats(S5_Show show);
}
