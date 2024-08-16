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
public class ChooseProductState implements State {

    public ChooseProductState() {
        System.out.println("Currently Vending Machine is in Choose Product State");
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
        //1: Get Item of this code number
        Item item = vendingMachine.getInventory().getItem(codeNumber);

        //2. Total Amount Paid by User
        int paidByUser = 0;
        for (Coin coin : vendingMachine.getCoins()) {
            paidByUser += coin.value;
        }

        //3. Compare product price and amount paid by user
        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount for the product. Original price is: " + item.getPrice() + " .But " +
                "you have only paid: " + paidByUser);
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficient Amount");
        } else {
            if (paidByUser > item.getPrice()) {
                getChange(paidByUser - item.getPrice());
            }
            vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, codeNumber));
        }

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refund back the full amount");
        vendingMachine.setVendingMachineState(new IdleState());
        return vendingMachine.getCoins();
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        System.out.println("Return the change in Coin Dispense tray: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {

    }
}
