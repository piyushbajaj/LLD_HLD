package LLD.Concept_And_Coding.L8_Elevator_System;

import LLD.Concept_And_Coding.L8_Elevator_System.Enum.Direction;
import LLD.Concept_And_Coding.L8_Elevator_System.Enum.Status;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 8:51 pm
 */
@Data
public class S3_Elevator {
    int id;
    S1_Display display;
    int currentFloor;
    Direction direction;
    Status status;
    S2_InternalButton internalButton;
    S1_Door door;

    S3_Elevator() {
        display = new S1_Display();
        internalButton = new S2_InternalButton();
        status = Status.IDLE;
        currentFloor = 0;
        direction = Direction.UP;
        door = new S1_Door();
    }

    public void moves(int destinationFloor, Direction direction) {

    }
}
