package LLD.Concept_And_Coding.L16_VendingMachine;

import LLD.Concept_And_Coding.L16_VendingMachine.Enum.ItemType;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L16_VendingMachine
 * <p>
 * User: piyushbajaj
 * Date: 10/04/23
 * Time: 1:22 pm
 */

@Data
public class Item {
    ItemType itemType;
    int price;
}
