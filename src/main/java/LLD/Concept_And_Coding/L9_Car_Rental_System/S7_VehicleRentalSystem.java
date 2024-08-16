package LLD.Concept_And_Coding.L9_Car_Rental_System;

import java.util.List;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L9_Car_Rental_System
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 7:26 pm
 */

@Data
public class S7_VehicleRentalSystem {
    List<S6_User> users;
    List<S2_Store> stores;

    public S7_VehicleRentalSystem(List<S2_Store> stores, List<S6_User> users) {
        this.users = users;
        this.stores = stores;
    }

    // Add Users
    // Remove Users
    // Add Stores
    // Remove Stores
}
