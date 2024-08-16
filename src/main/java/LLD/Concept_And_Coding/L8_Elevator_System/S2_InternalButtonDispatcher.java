package LLD.Concept_And_Coding.L8_Elevator_System;

import java.util.List;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 9:06 pm
 */
@Data
public class S2_InternalButtonDispatcher {
    List<S4_ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int elevatorId, S3_Elevator elevator) {
    }
}
