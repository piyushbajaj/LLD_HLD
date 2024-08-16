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
public class IdleState extends ATMState {

    public IdleState() {
        System.out.println("Insert your card");
    }

    @Override
    public void insertCard(ATM atm, DebitCard card) {
        System.out.println("Card is inserted");
        atm.setAtmState(new HasCardState());
    }
}
