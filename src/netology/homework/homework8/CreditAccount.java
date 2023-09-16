package netology.homework.homework8;

public class CreditAccount extends Account {
    long balance;
    long limit;
    String name;

    public CreditAccount(long balance, long limit, String name) {
        this.balance = balance;
        this.limit = limit;
        this.name = name;
    }

    @Override
    boolean add(long amount) {
        if (this.getBalance() + amount > 0) {
            return false;
        } else {
            this.balance += amount;
            return true;
        }
    }

    @Override
    boolean pay(long amount) {
        if ((this.getBalance() - amount) < -limit) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }

    @Override
    boolean transfer(Account account, long amount) {
        if ((this.getBalance() - amount) < -limit) {
            return false;
        } else {
            this.pay(amount);
            return account.add(amount);
        }
    }

    @Override
    long getBalance() {
        return balance;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    long getLimit() {
        return limit;
    }
}
