package LLD.Concept_And_Coding.L15_NullHandling;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L15_NullHandling
 * <p>
 * User: piyushbajaj
 * Date: 09/04/23
 * Time: 8:16 pm
 */
public class VehicleFactory {
    static Vehicle getVehicleObject(String typeOfVehicle) {
        if ("Car".equalsIgnoreCase(typeOfVehicle)) {
            return new Car();
        }

        // Instead of return null
        return new NullObject();
    }
}
