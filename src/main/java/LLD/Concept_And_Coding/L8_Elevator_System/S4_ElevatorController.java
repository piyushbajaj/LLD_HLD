package LLD.Concept_And_Coding.L8_Elevator_System;

import java.util.PriorityQueue;

import LLD.Concept_And_Coding.L8_Elevator_System.Enum.Direction;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 8:53 pm
 */
@Data
public class S4_ElevatorController {
    S3_Elevator elevator;
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    S4_ElevatorController(S3_Elevator elevator) {
        this.elevator = elevator;
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
    }

    public void submitExternalRequest(int floor, Direction direction) {
        if (direction == Direction.DOWN) {
            maxHeap.offer(floor);
        } else {
            minHeap.offer(floor);
        }
    }

    public void submitInternalRequest(int floor) {

    }

    public void controlElevator() {

    }
}
