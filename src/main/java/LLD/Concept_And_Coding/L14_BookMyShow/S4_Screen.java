package LLD.Concept_And_Coding.L14_BookMyShow;

import java.util.List;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L14_BookMyShow
 * <p>
 * User: piyushbajaj
 * Date: 08/04/23
 * Time: 5:53 pm
 */

@Data
public class S4_Screen {
    int screenId;
    List<S6_Seat> seatList;
}
