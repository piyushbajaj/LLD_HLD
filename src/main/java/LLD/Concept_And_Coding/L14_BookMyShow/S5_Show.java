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
 * Time: 5:54 pm
 */

@Data
public class S5_Show {
    int showId;
    S1_Movie movie;
    S4_Screen screen;
    int showStartTime;
    List<Integer> bookedSeatIds;

    S5_Show() {
        bookedSeatIds = new ArrayList<>();
    }
}
