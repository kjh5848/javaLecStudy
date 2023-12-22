package BankApp.model;

public class Account {
    private final int id;
    private long balance;
    private int UserId;

    public boolean 잔액부족하니(long amount) {
        if (balance < amount) {
            return true;
        }
        return false;
    }


    public void 출금(long amount) {
        this.balance = balance - amount;
    }

    public void 입금(long amount) {
        this.balance = balance + amount;
    }





    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        UserId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", UserId=" + UserId +
                '}';
    }
}
