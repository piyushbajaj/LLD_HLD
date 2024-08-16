package LLD.Concept_And_Coding.L9_Car_Rental_System;

import java.util.ArrayList;
import java.util.List;

import LLD.Concept_And_Coding.L9_Car_Rental_System.Product.S1_Vehicle;
import LLD.Concept_And_Coding.L9_Car_Rental_System.Product.VehicleType;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L9_Car_Rental_System.Product
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 5:38 pm
 */

@Data
public class S2_Store {
    int storeId;
    S3_VehicleManagementInventory vehicleManagementInventory;
    S4_Location location;
    List<S5_Reservation> reservations;

    S2_Store() {
        this.reservations = new ArrayList<>();
    }

    public List<S1_Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleManagementInventory.getVehicles();
    }

    public void storeVehicles(List<S1_Vehicle> vehicles) {
        vehicleManagementInventory = new S3_VehicleManagementInventory(vehicles);
    }

    public S5_Reservation createReservation(S1_Vehicle vehicle, S6_User user) {
        S5_Reservation reservation = new S5_Reservation();
        reservation.createReserve(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId) {
        //S5_Reservation reservation;
        for (S5_Reservation reservation : reservations) {
            if (reservation.getReservationId() == reservationId) {
                reservation.reservationStatus = ReservationStatus.COMPLETED;
                return true;
            }
        }

        return false;
    }
}
