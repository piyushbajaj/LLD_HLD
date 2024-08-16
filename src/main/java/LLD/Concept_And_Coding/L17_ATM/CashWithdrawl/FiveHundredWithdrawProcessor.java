package LLD.Concept_And_Coding.L17_ATM.CashWithdrawl;

import LLD.Concept_And_Coding.L17_ATM.ATM;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM.CashWithdrawl
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 6:03 pm
 */
public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor {
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int numberOf500NotesRequired = remainingAmount / 500;
        int balanceRemaining = remainingAmount % 500;

        int current500Notes = atm.getNoOfFiveHundredNotes();

        if (numberOf500NotesRequired <= current500Notes) {
            atm.deductFiveHundredNotes(numberOf500NotesRequired);
        } else {
            atm.deductFiveHundredNotes(current500Notes);
            balanceRemaining = balanceRemaining + (numberOf500NotesRequired - current500Notes) * 500;
        }

        if (balanceRemaining != 0) {
            super.withdraw(atm, balanceRemaining);
        }
    }
}
