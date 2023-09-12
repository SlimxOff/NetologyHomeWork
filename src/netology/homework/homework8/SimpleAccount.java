package netology.homework.homework8;

public class SimpleAccount extends Account {
    long balance;
    String name;

    @Override
    String getName() {
        return name;
    }

    public SimpleAccount(long balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    @Override
    boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    boolean pay(long amount) {
        if ((balance - amount) < 0) {
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
    boolean transfer(Account account, long amount) {
        if ((balance - amount) < 0) {
            return false;
        } else {
            account.add(amount);
            balance -= amount;
            return true;
        }
    }
}
