package LLD.Concept_And_Coding.L17_ATM.ATMStates;

import LLD.Concept_And_Coding.L17_ATM.ATM;
import LLD.Concept_And_Coding.L17_ATM.DebitCard;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM.ATMStates
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 2:26 pm
 */
public class CheckBalanceState extends ATMState {

    CheckBalanceState() {
    }

    @Override
    public void displayBalance(ATM atm, DebitCard card) {
        System.out.println("Current account balance: " + card.getBankBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        returnCard(atm);
        atm.setAtmState(new IdleState());
        System.out.println("Exit happened");
    }

    @Override
    public void returnCard(ATM atm) {
        System.out.println("Please collect your card");
    }


}
