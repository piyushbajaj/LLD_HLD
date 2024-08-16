package LLD.Concept_And_Coding.L16_VendingMachine;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L16_VendingMachine
 * <p>
 * User: piyushbajaj
 * Date: 10/04/23
 * Time: 2:17 pm
 */

@Data
public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;
}
