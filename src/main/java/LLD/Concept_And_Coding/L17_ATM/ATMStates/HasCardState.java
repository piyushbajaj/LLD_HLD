package LLD.Concept_And_Coding.L17_ATM.ATMStates;

import LLD.Concept_And_Coding.L17_ATM.ATM;
import LLD.Concept_And_Coding.L17_ATM.DebitCard;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM.ATMStates
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 2:25 pm
 */
public class HasCardState extends ATMState {

    HasCardState() {
        System.out.println("Enter your Card Pin");
    }

    @Override
    public void authenticatePin(ATM atm, DebitCard card, int pin) {
        if (card.isPINSuccessful(pin)) {
            System.out.println("Pin Authentication Successful!");
            atm.setAtmState(new SelectOperationState());
        } else {
            System.out.println("Invalid Pin!");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard(atm);
        atm.setAtmState(new IdleState());
    }

    @Override
    public void returnCard(ATM atm) {
        System.out.println("Please collect your card");
    }
}
