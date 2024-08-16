package LLD.Concept_And_Coding.L8_Elevator_System;

import java.util.ArrayList;
import java.util.List;

import LLD.Concept_And_Coding.L8_Elevator_System.Enum.Direction;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L8_Elevator_System
 * <p>
 * User: piyushbajaj
 * Date: 02/04/23
 * Time: 11:12 am
 */
public class Main {
    public static void main(String[] args) {
        List<S6_Floor> floorList = new ArrayList<>();
        S6_Floor floor1 = new S6_Floor(1);
        S6_Floor floor2 = new S6_Floor(2);
        S6_Floor floor3 = new S6_Floor(3);
        S6_Floor floor4 = new S6_Floor(4);
        S6_Floor floor5 = new S6_Floor(5);

        floorList.add(floor1);
        floorList.add(floor2);
        floorList.add(floor3);
        floorList.add(floor4);
        floorList.add(floor5);

        S7_Building building = new S7_Building(floorList);

        floor1.pressButton(Direction.UP);
    }
}
