package LLD.Concept_And_Coding.L17_ATM.CashWithdrawl;

import LLD.Concept_And_Coding.L17_ATM.ATM;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM.CashWithdrawl
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 6:02 pm
 */
public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor {
    public TwoThousandWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int numberOf2KNotesRequired = remainingAmount / 2000;
        int balanceRemaining = remainingAmount % 2000;

        int current2KNotes = atm.getNoOfTwoThousandNotes();

        if (numberOf2KNotesRequired <= current2KNotes) {
            atm.deductTwoThousandNotes(numberOf2KNotesRequired);
        } else {
            atm.deductTwoThousandNotes(current2KNotes);
            balanceRemaining = balanceRemaining + (numberOf2KNotesRequired - current2KNotes) * 2000;
        }

        if (balanceRemaining != 0) {
            super.withdraw(atm, balanceRemaining);
        }
    }
}
