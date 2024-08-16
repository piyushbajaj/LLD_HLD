package LLD.Concept_And_Coding.L8_Elevator_System;

import java.util.List;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 9:01 pm
 */

@Data
public class S5_ExternalButtonDispatcher {
    List<S4_ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

//    /**
//     * @param floor
//     * @param direction
//     */
//    public void submitExternalRequest(int floor, Direction direction) {
//        // For simplicity, lets follow even odd
//        for (ElevatorController elevatorController : elevatorControllerList) {
//            int elevatorId = elevatorController.elevator.id;
//            if (elevatorId % 2 == 0 && floor % 2 == 0) {
//                elevatorController.submitExternalRequest(floor, direction);
//            } else if (elevatorId % 2 == 1 && floor % 2 == 1) {
//                elevatorController.submitExternalRequest(floor, direction);
//            }
//        }
//    }

}
