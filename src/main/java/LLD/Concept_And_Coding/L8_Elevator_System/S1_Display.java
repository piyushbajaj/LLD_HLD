package LLD.Concept_And_Coding.L8_Elevator_System;

import LLD.Concept_And_Coding.L8_Elevator_System.Enum.Direction;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 8:48 pm
 */

@Data
public class S1_Display {
    int floor;
    Direction direction;

    public void showDisplay() {
        System.out.println(floor);
        System.out.println(direction);
    }
}
