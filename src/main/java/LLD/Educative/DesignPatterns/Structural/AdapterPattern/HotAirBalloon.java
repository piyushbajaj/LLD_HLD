package LLD.Educative.DesignPatterns.Structural.AdapterPattern;

/**
 * Project: DSAlgo
 * Package: LLD.Educative.DesignPatterns.Structural.AdapterPattern
 * <p>
 * User: piyushbajaj
 * Date: 14/04/23
 * Time: 10:48 pm
 */
public class HotAirBalloon {
    String gasUsed = "Helium";

    void fly(String gasUsed) {
        // Take-off sequence based on the kind of feul
        // Followed by more code.
    }

    // Function returns the gas used by the balloon for flight
    String inflateWithGas() {
        return gasUsed;
    }
}
