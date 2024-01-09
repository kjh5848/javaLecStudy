package ex04.bankTest.model02;

public class Account02 {
    private final int id;
    private long balance;
    private int userId;


    public boolean 잔액부족하니(long amount) {
        if(balance < amount) {
            return true;
        }
        return false;
    }


    public Account02(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account02{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
