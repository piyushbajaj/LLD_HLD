package LLD.Concept_And_Coding.L15_NullHandling;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L15_NullHandling
 * <p>
 * User: piyushbajaj
 * Date: 09/04/23
 * Time: 8:18 pm
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        // if vehicle!= null is not needed here, because of NULL Object

        System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
        System.out.println("Fuel tank Capacity: " + vehicle.getTankCapacity());
    }
}
