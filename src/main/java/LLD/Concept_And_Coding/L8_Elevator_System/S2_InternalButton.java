package LLD.Concept_And_Coding.L8_Elevator_System;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 8:52 pm
 */
@Data
public class S2_InternalButton {
    S2_InternalButtonDispatcher internalButtonDispatcher = new S2_InternalButtonDispatcher();

    Set<Integer> availableButtons = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    int buttonSelected;

    public void pressButton(int destination, S3_Elevator elevator) {
        if (availableButtons.contains(destination)) {
            internalButtonDispatcher.submitInternalRequest(elevator.id, elevator);
        }
    }
}
