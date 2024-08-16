package LLD.Concept_And_Coding.L8_Elevator_System;

import java.util.List;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 01/04/23
 * Time: 9:12 pm
 */

@Data
public class S7_Building {
    List<S6_Floor> floorList;

    S7_Building(List<S6_Floor> floorList) {
        this.floorList = floorList;
    }

    public void addFloor(S6_Floor newFloor) {
        floorList.add(newFloor);
    }

    public void removeFloor(S6_Floor newFloor) {
        floorList.remove(newFloor);
    }

    public List<S6_Floor> getAllFloors() {
        return floorList;
    }


}
