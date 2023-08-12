package netology.homework.homework4;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static int ERROR = 0;

    public static int firstTax(int earnings) {
        return (int) (earnings * 0.06);
    }

    public static int secondTax(int earnings, int spendings) {
        if ((earnings - spendings) > 0) {
            return (int) ((earnings - spendings) * 0.15);
        }
        return ERROR;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String earningsStr = "";
        String spendingsStr = "";
        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println("Выберите операцию и введите ее номер: ");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            String choose = scanner.nextLine();
            if ("end".equals(choose)) {
                System.out.println("Программа завершена!");
                break;
            }
            int operation = parseInt(choose);
            switch (operation) {
                case 1:
                    System.out.print("Введи доход: ");
                    earningsStr = scanner.nextLine();
                    System.out.println();
                    earnings += Integer.parseInt(earningsStr);
                    continue;
                case 2:
                    System.out.print("Введи расход: ");
                    spendingsStr = scanner.nextLine();
                    System.out.println();
                    spendings += Integer.parseInt(spendingsStr);
                    continue;
                case 3:
                    int tax1 = firstTax(earnings);
                    int tax2 = secondTax(earnings, spendings);
                    if (tax2 == ERROR) {
                        System.out.println("Ваши расходы больше доходов!");
                        System.out.println();
                    } else if (tax1 < tax2) {
                        System.out.println("Предлагаю вам УСН доходы.");
                        System.out.println("Налог составит: " + firstTax(earnings) + " рублей");
                        System.out.println("Налог на другой системе: " + secondTax(earnings, spendings) + " рублей");
                        System.out.println("Экономия: " + Math.abs(firstTax(earnings) - secondTax(earnings, spendings)) + " рублей");
                        System.out.println();
                    } else if (tax1 > tax2) {
                        System.out.println("Предлагаю вам УСН доходы минус расходы.");
                        System.out.println("Налог составит: " + secondTax(earnings, spendings) + " рублей");
                        System.out.println("Налог на другой системе: " + firstTax(earnings) + " рублей");
                        System.out.println("Экономия: " + Math.abs(firstTax(earnings) - secondTax(earnings, spendings)) + " рублей");
                        System.out.println();
                    } else {
                        System.out.println("Можете выбирать любую систему налогообложения");
                        System.out.println();
                    }
                    continue;
                default:
                    System.out.println("Такой команды нет!");
            }
        }

    }
}
