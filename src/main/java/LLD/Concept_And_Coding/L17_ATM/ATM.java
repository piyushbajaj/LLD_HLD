package LLD.Concept_And_Coding.L17_ATM;

import LLD.Concept_And_Coding.L17_ATM.ATMStates.ATMState;
import LLD.Concept_And_Coding.L17_ATM.ATMStates.IdleState;
import lombok.Getter;
import lombok.Setter;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 2:23 pm
 */
@Getter
public class ATM {
    private static ATM atmObject = new ATM(); // Singleton

    @Setter
    ATMState atmState;

    int atmBalance;

    int noOfTwoThousandNotes;

    int noOfFiveHundredNotes;

    int noOfOneHundredNotes;

    public void printCurrentATMStatus() {
        System.out.println("ATM Balance Remaining: " + getAtmBalance());
        System.out.println("2000's notes: " + getNoOfOneHundredNotes());
        System.out.println("500's notes: " + getNoOfFiveHundredNotes());
        System.out.println("100's notes: " + getNoOfOneHundredNotes());
    }

    public static ATM getAtmObject() {
        atmObject.setAtmState(new IdleState());
        return atmObject;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoThousandNotes, int noOfFiveHundredNotes,
                              int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }

    public void deductTwoThousandNotes(int number) {
        noOfTwoThousandNotes = noOfTwoThousandNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }
}
