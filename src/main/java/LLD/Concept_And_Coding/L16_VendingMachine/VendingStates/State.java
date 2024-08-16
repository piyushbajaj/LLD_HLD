package LLD.Concept_And_Coding.L16_VendingMachine.VendingStates;

import java.util.List;

import LLD.Concept_And_Coding.L16_VendingMachine.Enum.Coin;
import LLD.Concept_And_Coding.L16_VendingMachine.Item;
import LLD.Concept_And_Coding.L16_VendingMachine.VendingMachine;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L16_VendingMachine.VendingStates
 * <p>
 * User: piyushbajaj
 * Date: 10/04/23
 * Time: 1:14 pm
 */
public interface State {
    void clickInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    void clickSelectProductButton(VendingMachine vendingMachine) throws Exception;

    void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;

    List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;

    int getChange(int money) throws Exception;

    Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception;

    void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception;
}
