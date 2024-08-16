package LLD.UditTutorial.L6_BookMyShow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Project: DSAlgo
 * Package: LLD.UditTutorial.L6_BookMyShow
 * <p>
 * User: piyushbajaj
 * Date: 15/04/23
 * Time: 6:33 pm
 */

@Getter
@AllArgsConstructor
public class S4_Seat {
    private final String id;
    private final int rowNo;
    private final int seatNo;
}
