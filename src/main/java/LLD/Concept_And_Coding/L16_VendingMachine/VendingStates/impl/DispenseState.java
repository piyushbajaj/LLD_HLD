package LLD.Concept_And_Coding.L16_VendingMachine.VendingStates.impl;

import java.util.List;

import LLD.Concept_And_Coding.L16_VendingMachine.Enum.Coin;
import LLD.Concept_And_Coding.L16_VendingMachine.Item;
import LLD.Concept_And_Coding.L16_VendingMachine.VendingMachine;
import LLD.Concept_And_Coding.L16_VendingMachine.VendingStates.State;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L16_VendingMachine.VendingStates
 * <p>
 * User: piyushbajaj
 * Date: 10/04/23
 * Time: 1:37 pm
 */
public class DispenseState implements State {

    public DispenseState(VendingMachine vendingMachine, int codeNumber) throws Exception {
        System.out.println("Currently Vending Machine is in Dispense State");
        dispenseProduct(vendingMachine, codeNumber);
    }

    @Override
    public void clickInsertCoinButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {

    }

    @Override
    public void clickSelectProductButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }

    @Override
    public int getChange(int money) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);
        vendingMachine.setVendingMachineState(new IdleState());
        return item;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {

    }
}
