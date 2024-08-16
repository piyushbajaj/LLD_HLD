package LLD.Concept_And_Coding.L15_NullHandling;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L15_NullHandling
 * <p>
 * User: piyushbajaj
 * Date: 09/04/23
 * Time: 7:54 pm
 */
public class Car implements Vehicle{
    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}
