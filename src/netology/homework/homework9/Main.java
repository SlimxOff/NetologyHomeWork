package netology.homework.homework9;

import java.util.Scanner;

public class Main extends Exception {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordChecker passwordChecker = new PasswordChecker();
        String minLength;
        String maxRepeat;
        String choose = "";
        System.out.println("Введите минимальную длину пароля: ");
        minLength = scanner.nextLine();
        try {
            passwordChecker.setMinLength(Integer.parseInt(minLength));
        } catch (IllegalArgumentException e) {
            System.out.println("Вы ввели неверный аргумент!");
            System.exit(0);
        }

        System.out.println("Введите максимальное количество повторений символов: ");
        maxRepeat = scanner.nextLine();
        try {
            passwordChecker.setMaxRepeats(Integer.parseInt(maxRepeat));
        } catch (IllegalArgumentException e) {
            System.out.println("Вы ввели неверный аргумент!");
            System.exit(0);
        }
        while (!choose.equals("end")) {
            System.out.println("Введите пароль: ");
            choose = scanner.nextLine();
            if (choose.equals("end")) {
                System.out.println("Bye!");
                break;
            }
            try {
                passwordChecker.verifyPassword(choose);
            } catch (IllegalStateException e) {
                System.out.println(e);
                choose = "end";
            }
        }
    }
}
