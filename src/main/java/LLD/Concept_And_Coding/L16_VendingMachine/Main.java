package LLD.Concept_And_Coding.L16_VendingMachine;

import LLD.Concept_And_Coding.L16_VendingMachine.Enum.Coin;
import LLD.Concept_And_Coding.L16_VendingMachine.Enum.ItemType;
import LLD.Concept_And_Coding.L16_VendingMachine.VendingStates.State;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L16_VendingMachine
 * <p>
 * User: piyushbajaj
 * Date: 10/04/23
 * Time: 2:13 pm
 */
public class Main {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        try {
            System.out.println("**********************************************");
            System.out.println("Fill Up the Inventory");
            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("**********************************************");
            System.out.println("Clicking on Insert Coin button");

            State vendingState = vendingMachine.getVendingMachineState();
            // Default State is Idle State
            vendingState.clickInsertCoinButton(vendingMachine); // State updated to Collect Money State

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.insertCoin(vendingMachine, Coin.NICKLE);
            vendingState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("**********************************************");
            System.out.println("Clicking on Select Product button");
            vendingState.clickSelectProductButton(vendingMachine); // State updated to Choose Product State

            vendingState = vendingMachine.getVendingMachineState();
            vendingState.chooseProduct(vendingMachine, 102);

            System.out.println("**********************************************");
            displayInventory(vendingMachine);


        } catch (Exception e) {

        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelves = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < itemShelves.length; i++) {
            Item newItem = new Item();
            if (i >= 0 && i < 3) {
                newItem.setItemType(ItemType.COKE);
                newItem.setPrice(12);
            } else if (i >= 3 && i < 5) {
                newItem.setItemType(ItemType.PEPSI);
                newItem.setPrice(9);
            } else if (i >= 5 && i < 7) {
                newItem.setItemType(ItemType.JUICE);
                newItem.setPrice(13);
            } else if (i >= 7 && i < 10) {
                newItem.setItemType(ItemType.SODA);
                newItem.setPrice(7);
            }
            itemShelves[i].setItem(newItem);
            itemShelves[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] itemShelves = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < itemShelves.length; i++) {
            System.out.println(
                "CodeNumber: " + itemShelves[i].getCode() + ", Item: " + itemShelves[i].getItem().getItemType() +
                    ", Price: " + itemShelves[i].getItem().getPrice() + ", IsAvailable: " + !itemShelves[i].isSoldOut());
        }
    }
}
