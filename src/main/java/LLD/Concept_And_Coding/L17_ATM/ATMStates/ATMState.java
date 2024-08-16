package LLD.Concept_And_Coding.L17_ATM.ATMStates;

import LLD.Concept_And_Coding.L17_ATM.ATM;
import LLD.Concept_And_Coding.L17_ATM.DebitCard;
import LLD.Concept_And_Coding.L17_ATM.TransactionType;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM.ATMStates
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 2:16 pm
 */
public abstract class ATMState {

    public void insertCard(ATM atm, DebitCard card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void authenticatePin(ATM atm, DebitCard card, int pin) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void selectOperation(ATM atm, DebitCard card, TransactionType transactionType) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void cashWithdraw(ATM atm, DebitCard card, int amountToWithdraw) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void displayBalance(ATM atm, DebitCard card) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void returnCard(ATM atm) {
        System.out.println("OOPS!! Something went wrong");
    }

    public void exit(ATM atm) {
        System.out.println("OOPS!! Something went wrong");
    }


}
