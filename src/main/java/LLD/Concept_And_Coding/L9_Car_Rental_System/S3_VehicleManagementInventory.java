package LLD.Concept_And_Coding.L9_Car_Rental_System;

import java.util.List;

import LLD.Concept_And_Coding.L9_Car_Rental_System.Product.S1_Vehicle;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L9_Car_Rental_System.Product
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 6:08 pm
 */

@Data
public class S3_VehicleManagementInventory {
    List<S1_Vehicle> vehicles;

    public S3_VehicleManagementInventory(List<S1_Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
