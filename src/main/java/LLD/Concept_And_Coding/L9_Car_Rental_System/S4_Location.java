package LLD.Concept_And_Coding.L9_Car_Rental_System;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L9_Car_Rental_System
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 6:09 pm
 */

@Data
public class S4_Location {
    String address;
    int pincode;
    String city;
    String state;
    String country;

    public S4_Location(int pincode, String city, String state, String country) {
        this.pincode = pincode;
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
