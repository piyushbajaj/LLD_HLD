package LLD.Concept_And_Coding.L17_ATM;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 2:32 pm
 */
public enum TransactionType {
    CASH_WITHDRAW,
    BALANCE_CHECK;

    public static void showAllTransactionTypes() {
        for (TransactionType transactionType : TransactionType.values()) {
            System.out.println(transactionType.name());
        }
    }
}
