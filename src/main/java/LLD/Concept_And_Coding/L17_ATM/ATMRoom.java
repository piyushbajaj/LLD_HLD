package LLD.Concept_And_Coding.L17_ATM;

import lombok.Data;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L17_ATM
 * <p>
 * User: piyushbajaj
 * Date: 12/04/23
 * Time: 2:24 pm
 */

@Data
public class ATMRoom {
    ATM atm;
    User user;
//    DebitCard card;

    public static void main(String[] args) {
        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();
        // Step1: Print the current balance
        atmRoom.atm.printCurrentATMStatus();
        System.out.println("Debit card balance: " + atmRoom.user.card.getBankBalance());

        // Step2: Insert the card
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm, atmRoom.user.card);

        // Step3: Authenticate Pin
        atmRoom.atm.getAtmState().authenticatePin(atmRoom.atm, atmRoom.user.card, 1023);

        // Step4: Select the operation
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm, atmRoom.user.card, TransactionType.CASH_WITHDRAW);

        // Step5: Cash Withdraw
        atmRoom.atm.getAtmState().cashWithdraw(atmRoom.atm, atmRoom.user.card, 2700);

        // Step6: Print the balance
        atmRoom.atm.printCurrentATMStatus();
    }

    private void initialize() {
        // create ATM
        atm = ATM.getAtmObject();
        atm.setAtmBalance(3500, 1, 2, 5);

        this.user = createUser();
//        this.card = createCard();
    }

    private User createUser() {
        User user = new User();
        user.setCard(createCard());

        return user;
    }

    private DebitCard createCard() {
        DebitCard debitCard = new DebitCard();
        debitCard.setBankAccount(createBankAccount());

        return debitCard;
    }

    private BankAccount createBankAccount() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(3000);

        return bankAccount;
    }
}
