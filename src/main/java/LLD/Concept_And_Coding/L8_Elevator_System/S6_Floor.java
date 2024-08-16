package LLD.Concept_And_Coding.L8_Elevator_System;

import LLD.Concept_And_Coding.L8_Elevator_System.Enum.Direction;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 9:11 pm
 */

@Data
public class S6_Floor {
    int floor;
    S5_OddEvenDispatcher externalButtonDispatcher;

    public S6_Floor(int floor) {
        this.floor = floor;
        externalButtonDispatcher = new S5_OddEvenDispatcher();
    }

    public void pressButton(Direction direction) {
        externalButtonDispatcher.submitExternalRequest(floor, direction);
    }
}
