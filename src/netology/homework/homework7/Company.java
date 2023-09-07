package netology.homework.homework7;

import netology.homework.homework7.taxes.TaxSystem;

public class Company {
    String title;
    int debit = 0;
    int credit = 0;
    TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        System.out.println("Компания " + title + " уплатила налог в размере: " + taxSystem.calcTaxFor(debit, credit) + " руб.");
        debit = 0;
        credit = 0;
    }
}
