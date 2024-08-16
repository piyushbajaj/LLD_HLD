package LLD.Concept_And_Coding.L9_Car_Rental_System;

import java.util.Date;

import LLD.Concept_And_Coding.L9_Car_Rental_System.Product.S1_Vehicle;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L9_Car_Rental_System
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 6:10 pm
 */

@Data
public class S5_Reservation {
    int reservationId;
    S6_User user;
    S1_Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    S4_Location pickUpLocation;
    S4_Location dropLocation;
    ReservationStatus reservationStatus;
    ReservationType reservationType;
    S4_Location location;

    public int createReserve(S6_User user, S1_Vehicle vehicle) {
        reservationId = 12232;
        this.user = user;
        this.vehicle = vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }
}
