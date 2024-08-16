package LLD.Concept_And_Coding.L8_Elevator_System;

import java.util.ArrayList;
import java.util.List;

import LLD.Concept_And_Coding.L8_Elevator_System.Enum.Direction;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 9:09 pm
 */

@Data
public class ExternalButton {
    List<S5_ExternalButtonDispatcher> externalButtonDispatcherList;

    ExternalButton() {
        this.externalButtonDispatcherList = new ArrayList<>();
    }

    public void pressButton(int floor, Direction direction) {
    }
}
