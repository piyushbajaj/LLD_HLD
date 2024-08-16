package LLD.Concept_And_Coding.L14_BookMyShow;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L14_BookMyShow
 * <p>
 * User: piyushbajaj
 * Date: 08/04/23
 * Time: 6:09 pm
 */

@Data
public class S8_Booking {
    S5_Show show;
    List<S6_Seat> bookedSeats;
    S9_Payment payment;

    S8_Booking() {
        bookedSeats = new ArrayList<>();
    }
}
