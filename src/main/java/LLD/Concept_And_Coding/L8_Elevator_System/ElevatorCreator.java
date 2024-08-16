package LLD.Concept_And_Coding.L8_Elevator_System;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 9:20 pm
 */
public class ElevatorCreator {
    static List<S4_ElevatorController> elevatorControllerList = new ArrayList<>();

    static {
        S3_Elevator elevator1 = new S3_Elevator();
        elevator1.id = 1;
        S4_ElevatorController elevatorController1 = new S4_ElevatorController(elevator1);

        S3_Elevator elevator2 = new S3_Elevator();
        elevator2.id = 1;
        S4_ElevatorController elevatorController2 = new S4_ElevatorController(elevator2);

        elevatorControllerList.add(elevatorController1);
        elevatorControllerList.add(elevatorController2);
    }
}
