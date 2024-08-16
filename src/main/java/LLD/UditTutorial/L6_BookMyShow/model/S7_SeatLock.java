package LLD.UditTutorial.L6_BookMyShow.model;

import java.time.Instant;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow.model
 * <p>
 * User: piyushbajaj
 * Date: 15/04/23
 * Time: 7:15 pm
 */

@Getter
@AllArgsConstructor
public class S7_SeatLock {
    private S4_Seat seat;
    private S5_Show show;
    private Integer timeoutInSec;
    private Date lockTime;
    private String lockedBy;

    public boolean isLockExpired() {
        final Instant lockInstant = lockTime.toInstant().plusSeconds(timeoutInSec);
        final Instant currentInstant = new Date().toInstant();
        return lockInstant.isBefore(currentInstant);
    }
}
