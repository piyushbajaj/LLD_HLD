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
 * Time: 1:23 pm
 */
public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently vending machine is in IdleState");
    }

    @Override
    public void clickInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new CollectMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("Cannot insert coin in idle state");
    }

    @Override
    public void clickSelectProductButton(VendingMachine vendingMachine) {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) {

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }

    @Override
    public int getChange(int money) {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) {
//        vendingMachine.getInventory().ad
    }
}
