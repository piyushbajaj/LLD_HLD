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
 * Time: 1:36 pm
 */
public class CollectMoneyState implements State {
    public CollectMoneyState() {
        System.out.println("Currently Vending Machine is in Collect Money State");
    }

    @Override
    public void clickInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Accepted the coin: " + coin.value);
        vendingMachine.getCoins().add(coin);
    }

    @Override
    public void clickSelectProductButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new ChooseProductState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned full amount back to the coin dispense tray");
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getCoins();
    }

    @Override
    public int getChange(int money) throws Exception {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {

    }
}
