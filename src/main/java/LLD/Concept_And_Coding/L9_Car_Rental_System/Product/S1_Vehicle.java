package LLD.Concept_And_Coding.L9_Car_Rental_System.Product;

import java.util.Date;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L9_Car_Rental_System.Product
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 4:51 pm
 */

@Data
public class S1_Vehicle {
    int vehicleId;
    int vehicleNumber;
    VehicleType vehicleType;
    String companyName;
    String modelName;
    Date manufacturingDate;
    int average;
    int cc;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeats;
    int kmsDriven;
    Status status;
}
