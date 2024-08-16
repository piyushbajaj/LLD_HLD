package LLD.Concept_And_Coding.L8_Elevator_System;

import LLD.Concept_And_Coding.L8_Elevator_System.Enum.Direction;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 9:05 pm
 */
public class S5_OddEvenDispatcher extends S5_ExternalButtonDispatcher {
    public void submitExternalRequest(int floor, Direction direction) {
        // For simplicity, lets follow even odd
        for (S4_ElevatorController elevatorController : elevatorControllerList) {
            int elevatorId = elevatorController.elevator.id;
            if (elevatorId % 2 == 0 && floor % 2 == 0) {
                elevatorController.submitExternalRequest(floor, direction);
            } else if (elevatorId % 2 == 1 && floor % 2 == 1) {
                elevatorController.submitExternalRequest(floor, direction);
            }
        }
    }
}
