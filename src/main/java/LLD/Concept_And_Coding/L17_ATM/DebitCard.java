package LLD.Concept_And_Coding.L17_ATM;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 2:15 pm
 */

@Data
public class DebitCard {
    long cardNumber;
    int cvv;
    int expiryDate;
    String cardHolderName;
    BankAccount bankAccount;
    static int PIN = 1023;

    public boolean isPINSuccessful(int pin) {
        if (pin == PIN) {
            return true;
        }
        return false;
    }

    public int getBankBalance() {
        return bankAccount.getBalance();
    }

    public void deductBalance(int amount) {
        bankAccount.balancePostWithdraw(amount);
    }
}
