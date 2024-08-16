package LLD.Concept_And_Coding.L17_ATM.CashWithdrawl;

import LLD.Concept_And_Coding.L17_ATM.ATM;
import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM.CashWithdrawl
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 4:27 pm
 */

@Data
public class CashWithdrawProcessor {
    CashWithdrawProcessor nextProcessor;

    CashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        this.nextProcessor = cashWithdrawProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount) {
        if (nextProcessor != null) {
            nextProcessor.withdraw(atm, remainingAmount);
        }
    }


}
