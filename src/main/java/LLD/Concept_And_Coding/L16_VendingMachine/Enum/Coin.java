package LLD.Concept_And_Coding.L16_VendingMachine.Enum;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L16_VendingMachine
 * <p>
 * User: piyushbajaj
 * Date: 10/04/23
 * Time: 1:17 pm
 */
public enum Coin {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);

    public final int value;

    Coin(int value) {
        this.value = value;
    }
}
