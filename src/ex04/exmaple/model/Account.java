package ex04.exmaple.model;

public class Account {
    private final int id;
    private long balance;
    private int userId;

    public boolean 잔액부족하니(long amount) {
        if (balance < amount) {
            return true;
        }
        return false;
    }
    public void 출금(long amount) { // 메소드는 하나의 책임을 가진다.
        this.balance = this.balance - amount;
    }
    public void 입금(long amount) { // 메소드는 하나의 책임을 가진다.
        this.balance = this.balance + amount;
    }

    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }



    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}

