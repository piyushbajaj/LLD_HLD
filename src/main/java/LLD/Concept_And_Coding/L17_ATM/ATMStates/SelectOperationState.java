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
 * Time: 2:25 pm
 */
public class SelectOperationState extends ATMState {

    SelectOperationState() {
        System.out.println("Please select one from the following operations");
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, DebitCard card, TransactionType transactionType) {
        switch (transactionType) {
            case BALANCE_CHECK:
                atm.setAtmState(new CheckBalanceState());
                break;
            case CASH_WITHDRAW:
                atm.setAtmState(new CashWithdrawState());
                break;
            default:
                System.out.println("Invalid option");
                exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
        returnCard(atm);
        atm.setAtmState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(ATM atm) {
        System.out.println("Please collect your card");
    }

    private void showOperations() {
        TransactionType.showAllTransactionTypes();
    }
}
