package LLD.UditTutorial.L6_BookMyShow.providers;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import LLD.UditTutorial.L6_BookMyShow.exceptions.SeatTemporaryUnavailableException;
import LLD.UditTutorial.L6_BookMyShow.model.S4_Seat;
import LLD.UditTutorial.L6_BookMyShow.model.S5_Show;
import LLD.UditTutorial.L6_BookMyShow.model.S7_SeatLock;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.providers
 * <p>
 * User: piyushbajaj
 * Date: 17/04/23
 * Time: 2:32 pm
 */
public class InMemorySeatLockProvider implements SeatLockProvider {
    private final Integer lockTimeout; // Bonus feature.
    private final Map<S5_Show, Map<S4_Seat, S7_SeatLock>> locks;

    public InMemorySeatLockProvider(Integer lockTimeout) {
        this.lockTimeout = lockTimeout;
        this.locks = new HashMap<>();
    }

    @Override
    public synchronized void lockSeats(S5_Show show, List<S4_Seat> seats, String user) {
        for (S4_Seat seat : seats) {
            if (isSeatLocked(show, seat)) {
                throw new SeatTemporaryUnavailableException();
            }
        }

        for (S4_Seat seat : seats) {
            lockSeat(show, seat, user, lockTimeout);
        }
    }

    @Override
    public void unlockSeats(S5_Show show, List<S4_Seat> seats, String user) {
        for (S4_Seat seat : seats) {
            if (validateLock(show, seat, user)) {
                unlockSeat(show, seat);
            }
        }
    }

    private void unlockSeat(S5_Show show, S4_Seat seat) {
        if (locks.containsKey(show)) {
            locks.get(show).remove(seat);
        }
    }

    @Override
    public boolean validateLock(S5_Show show, S4_Seat seat, String user) {
        return isSeatLocked(show, seat) && locks.get(show).get(seat).getLockedBy().equalsIgnoreCase(user);
    }

    @Override
    public List<S4_Seat> getLockedSeats(S5_Show show) {
        if (!locks.containsKey(show)) {
            return new ArrayList<>();
        }

        return new ArrayList<>(locks.get(show).keySet());
    }

    private void lockSeat(final S5_Show show, final S4_Seat seat, final String user, final Integer timeoutInSec) {
        if (!locks.containsKey(show)) {
            locks.put(show, new HashMap<>());
        }

        final S7_SeatLock seatLock = new S7_SeatLock(seat, show, timeoutInSec, new Date(), user);
        locks.get(show).put(seat, seatLock);
    }

    private boolean isSeatLocked(final S5_Show show, final S4_Seat seat) {
        return locks.containsKey(show) && locks.get(show).containsKey(seat) &&
            !locks.get(show).get(seat).isLockExpired();
    }
}
