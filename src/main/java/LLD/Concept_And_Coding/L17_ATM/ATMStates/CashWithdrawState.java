package LLD.Concept_And_Coding.L17_ATM.ATMStates;

import LLD.Concept_And_Coding.L17_ATM.ATM;
import LLD.Concept_And_Coding.L17_ATM.CashWithdrawl.CashWithdrawProcessor;
import LLD.Concept_And_Coding.L17_ATM.CashWithdrawl.FiveHundredWithdrawProcessor;
import LLD.Concept_And_Coding.L17_ATM.CashWithdrawl.OneHundredWithdrawProcessor;
import LLD.Concept_And_Coding.L17_ATM.CashWithdrawl.TwoThousandWithdrawProcessor;
import LLD.Concept_And_Coding.L17_ATM.DebitCard;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM.ATMStates
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 2:26 pm
 */
public class CashWithdrawState extends ATMState {
    public CashWithdrawState() {
        System.out.println("Please enter withdrawal amount");
    }

    @Override
    public void cashWithdraw(ATM atm, DebitCard card, int amountToWithdraw) {
        if (amountToWithdraw > atm.getAtmBalance()) {
            System.out.println("Insufficient amount in the ATM machine");
            exit(atm);
        } else if (amountToWithdraw > card.getBankBalance()) {
            System.out.println("Insufficient amount in your debit card");
            exit(atm);
        } else {
            card.deductBalance(amountToWithdraw);
            atm.deductATMBalance(amountToWithdraw);

            // using chain of responsibility
            CashWithdrawProcessor cashWithdrawProcessor =
                new TwoThousandWithdrawProcessor(
                    new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            cashWithdrawProcessor.withdraw(atm, amountToWithdraw);
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard(atm);
        atm.setAtmState(new IdleState());
        System.out.println("Exit happened");
    }

    @Override
    public void returnCard(ATM atm) {
        System.out.println("Please collect your card!");

    }
}
