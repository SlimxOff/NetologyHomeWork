package netology.homework.homework8;

public class SimpleAccount extends Account {
    long balance;
    String name;

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
    boolean transfer(Account account, long amount) {
        if (this.getBalance() < amount) {
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
}
