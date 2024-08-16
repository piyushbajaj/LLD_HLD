package LLD.Concept_And_Coding.L9_Car_Rental_System;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L9_Car_Rental_System
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 7:36 pm
 */

@Data
public class S8_Bill {
    S5_Reservation reservation;
    boolean isPaid;
    double totalBillAmount;

    public S8_Bill(S5_Reservation reservation) {
        this.reservation = reservation;
        this.isPaid = false;
        this.totalBillAmount = computeBillAmount();
    }

    private double computeBillAmount() {
        return 100.0;
    }
}
