package BankApp;

import BankApp.model.Account;

//트랜잭션 관리
public class BankAppService {

    public static void 출금(Account senderAccount, Account receiverAccount, long amount) {
        if (amount <= 0) {
            System.out.println("잔액이 부족합니다.");
            return;

        }

    }




}
