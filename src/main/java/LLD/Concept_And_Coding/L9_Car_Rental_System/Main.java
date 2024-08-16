package LLD.Concept_And_Coding.L9_Car_Rental_System;

import java.util.ArrayList;
import java.util.List;

import LLD.Concept_And_Coding.L9_Car_Rental_System.Product.S1_Vehicle;
import LLD.Concept_And_Coding.L9_Car_Rental_System.Product.VehicleType;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L9_Car_Rental_System
 * <p>
 * User: piyushbajaj
 * Date: 06/04/23
 * Time: 7:39 pm
 */
public class Main {

    public static void main(String[] args) {
        List<S6_User> users = addUsers();
        List<S1_Vehicle> vehicles = addVehicles();
        List<S2_Store> stores = addStores(vehicles);

        S7_VehicleRentalSystem rentalSystem = new S7_VehicleRentalSystem(stores, users);

        // User comes
        S6_User user = users.get(0);

        // User will search the store based on location
        S4_Location location = new S4_Location(495001, "Bilaspur", "Chhattisgarh", "India");
        S2_Store store = rentalSystem.getStores().get(0);

        // Get all Vehicles you are interested in
        List<S1_Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);

        // Reserving the particular website
        S5_Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));

        // Generate the bill
        S8_Bill bill = new S8_Bill(reservation);

        // make payment
        S9_Payment payment = new S9_Payment();
        payment.payBill(bill);

        // trip completed submit the vehicle and close reservation
        store.completeReservation(reservation.reservationId);
    }

    public static List<S6_User> addUsers() {
        List<S6_User> users = new ArrayList<>();
        S6_User user1 = new S6_User();
        user1.setUserId(1);

        users.add(user1);
        return users;
    }

    public static List<S1_Vehicle> addVehicles() {
        List<S1_Vehicle> vehicles = new ArrayList<>();
        S1_Vehicle vehicle1 = new S1_Vehicle();
        vehicle1.setVehicleId(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        S1_Vehicle vehicle2 = new S1_Vehicle();
        vehicle2.setVehicleId(2);
        vehicle2.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<S2_Store> addStores(List<S1_Vehicle> vehicles) {
        List<S2_Store> stores = new ArrayList<>();
        S2_Store store1 = new S2_Store();
        store1.storeVehicles(vehicles);
        store1.setStoreId(1);

        stores.add(store1);
        return stores;
    }
}
