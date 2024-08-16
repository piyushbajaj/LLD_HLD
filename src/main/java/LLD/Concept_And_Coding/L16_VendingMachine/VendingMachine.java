package LLD.Concept_And_Coding.L16_VendingMachine;

import java.util.ArrayList;
import java.util.List;

import LLD.Concept_And_Coding.L16_VendingMachine.Enum.Coin;
import LLD.Concept_And_Coding.L16_VendingMachine.VendingStates.impl.IdleState;
import LLD.Concept_And_Coding.L16_VendingMachine.VendingStates.State;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L16_VendingMachine.VendingStates
 * <p>
 * User: piyushbajaj
 * Date: 10/04/23
 * Time: 1:15 pm
 */

@Data
public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coins;

    public VendingMachine() {
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coins = new ArrayList<>();
    }
}
