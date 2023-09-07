package netology.homework.homework7;

import netology.homework.homework7.taxes.*;

public class Main {
    public static void main(String[] args) {
        //Проверка первой налоговой системы
        TaxSystem taxSystem1 = new TaxDebit();
        Company company1 = new Company("Test", taxSystem1);
        company1.shiftMoney(1000);
        company1.shiftMoney(-100);
        company1.payTaxes();

        System.out.println(" ");
        //Проверка второй налоговой системы
        TaxSystem taxSystem2 = new TaxDebitMinusCredit();
        Company company2 = new Company("Test2", taxSystem2);
        company2.shiftMoney(1000);
        company2.shiftMoney(-100);
        company2.payTaxes();

        System.out.println(" ");
        //Проверка смены налоговой системы
        TaxSystem taxSystem3 = new TaxDebitMinusCredit();
        Company company3 = new Company("Test3", taxSystem3);
        company3.shiftMoney(1000);
        company3.shiftMoney(-100);
        company3.setTaxSystem(new TaxDebit());
        company3.payTaxes();

        System.out.println(" ");
        //Проверка на отрицательный налог
        TaxSystem taxSystem4 = new TaxDebitMinusCredit();
        Company company4 = new Company("Test2", taxSystem4);
        company4.shiftMoney(-1000);
        company4.shiftMoney(-100);
        company4.payTaxes();
    }


}
