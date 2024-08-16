package LLD.Concept_And_Coding.L14_BookMyShow;

import LLD.Concept_And_Coding.L14_BookMyShow.Enum.SeatCategory;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L14_BookMyShow
 * <p>
 * User: piyushbajaj
 * Date: 08/04/23
 * Time: 5:56 pm
 */

@Data
public class S6_Seat {
    int seatId;
    int price;
    int row;
    SeatCategory seatCategory;
}
