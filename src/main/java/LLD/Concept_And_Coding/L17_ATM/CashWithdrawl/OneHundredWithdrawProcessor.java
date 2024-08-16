package LLD.Concept_And_Coding.L17_ATM.CashWithdrawl;

import LLD.Concept_And_Coding.L17_ATM.ATM;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM.CashWithdrawl
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 6:04 pm
 */
public class OneHundredWithdrawProcessor extends CashWithdrawProcessor {
    public OneHundredWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int numberOf100NotesRequired = remainingAmount / 100;
        int balanceRemaining = remainingAmount % 100;

        int current100Notes = atm.getNoOfOneHundredNotes();

        if (numberOf100NotesRequired <= current100Notes) {
            atm.deductOneHundredNotes(numberOf100NotesRequired);
        } else {
            atm.deductOneHundredNotes(current100Notes);
            balanceRemaining = balanceRemaining + (numberOf100NotesRequired - current100Notes) * 100;
        }

        if (balanceRemaining != 0) {
            super.withdraw(atm, balanceRemaining);
        }
    }
}
