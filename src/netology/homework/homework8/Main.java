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

    public static void testTransfer(long amount, Account accountFrom, Account accountTo) {
        if (accountFrom.transfer(accountTo, amount)) {
            System.out.println("Перевод с " + accountFrom.getName() + " на " + accountTo.getName() + " в размере: " + amount + "руб. прошел успешно");
            System.out.println("Остаток на счёте с которого переводили: " + accountFrom.getBalance() + " руб.");
            System.out.println("Баланс на счёте на который переводили: " + accountTo.getBalance() + " руб.");
        } else {
            System.out.println("Перевод не прошел");
        }
    }

    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(15000, "обычный счет");
        CreditAccount creditAccount = new CreditAccount(10000, 25000, "кредитный счет");
        //Проверим работу пополнения
        testAdd(10000, simpleAccount);
        testAdd(1000, simpleAccount);
        testAdd(1000, creditAccount);
        testAdd(25001, creditAccount);
        System.out.println(" ");
        //Проверка работы оплаты
        testPay(1000, simpleAccount);
        testPay(26000, simpleAccount);
        testPay(2000, creditAccount);
        testPay(25000, creditAccount);
        testPay(9001, creditAccount);
        System.out.println(" ");
        //Проверка перевода
        testTransfer(1000, simpleAccount, creditAccount);
        testTransfer(109000, creditAccount, simpleAccount);
        testTransfer(20000, simpleAccount, creditAccount);
        testTransfer(1000, creditAccount, simpleAccount);
    }

}
