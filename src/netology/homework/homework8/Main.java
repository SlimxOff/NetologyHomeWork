package netology.homework.homework8;

public class Main {
    long amount;

    public static void testAdd(long amount, Account account) {
        System.out.println("Изначальный баланс на " + account.getName() + ": " + account.getBalance() + " руб.");
        if (account.add(amount)) {
            System.out.println("Баланс на счете после пополнения на " + amount + ": " + account.getBalance());
        } else {
            System.out.println("Пополнение невозможно");
        }
    }

    public static void testPay(long amount, Account account) {
        System.out.println("Изначальный баланс на " + account.getName() + ": " + account.getBalance() + " руб.");
        if (account.pay(amount)) {
            System.out.println("Оплата прошла успешно, остаток на счете: " + account.getBalance());
        } else {
            System.out.println("Оплата не прошла");
        }
    }

    public static void testTransfer(long amount, Account accountFrom, Account accountTo, boolean choose) {
        if (accountFrom.transfer(accountTo, amount) && choose) {
            System.out.println("Перевод с " + accountFrom.getName() + " на " + accountTo.getName() + " в размере: " + amount + "руб. прошел успешно");
            System.out.println("Остаток на счёте с которого переводили: " + accountFrom.getBalance() + " руб.");
            System.out.println("Баланс на счёте на который переводили: " + accountTo.getBalance() + " руб.");
        } else {
            System.out.println("Перевод не прошел или был отклонен");
        }
    }

    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(15000, "обычный счет");
        CreditAccount creditAccount = new CreditAccount(0, 25000, "кредитный счет");
        testAdd(50000, simpleAccount);
        System.out.println(" ");
        testPay(24000, creditAccount);
        System.out.println(" ");
        testAdd(100000, creditAccount);
        System.out.println(" ");
        testTransfer(24000, simpleAccount, creditAccount, true);
        System.out.println(" ");
        testTransfer(24000, simpleAccount, creditAccount, false);
        System.out.println(" ");
        testTransfer(25000, creditAccount, simpleAccount, true);
        System.out.println(" ");
        testTransfer(25001, creditAccount, simpleAccount, true);
        System.out.println(" ");
        testPay(100000, simpleAccount);
    }

}
