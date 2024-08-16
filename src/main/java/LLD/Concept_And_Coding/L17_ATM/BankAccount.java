package LLD.Concept_And_Coding.L17_ATM;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 2:14 pm
 */

@Data
public class BankAccount {
    long accountNumber;
    String bankName;
    int balance;

    public void balancePostWithdraw(int amount) {
        balance = balance - amount;
    }
}
