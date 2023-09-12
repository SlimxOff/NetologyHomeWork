package netology.homework.homework8;

public class CreditAccount extends Account {
    long balance;
    long limit;

    @Override
    String getName() {
        return name;
    }

    String name;

    public CreditAccount(long balance, long limit, String name) {
        this.balance = balance;
        this.limit = limit;
        this.name = name;
    }

    @Override
    boolean add(long amount) {
        if ((balance + amount) > limit) {
            return false;
        } else {
            balance += amount;
            return true;
        }
    }

    @Override
    boolean pay(long amount) {
        if ((balance - amount) < -limit) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    @Override
    long getBalance() {
        return balance;
    }

    @Override
    long getLimit() {
        return limit;
    }

    @Override
    boolean transfer(Account account, long amount) {
        if ((balance - amount) < -limit) {
            return false;
        } else {
            account.add(amount);
            balance -= amount;
            return true;
        }
    }
}
