package netology.homework.homework9;


public class PasswordChecker {
    public int checkRepeats(String password, int maxRepeats) {
        char c = password.charAt(0);
        char a;
        int count = 0;
        int i = 0;
        while (count <= maxRepeats && i < password.length()) {
            a = password.charAt(i);
            i++;
            if (a == c) {
                count++;
            } else {
                c = password.charAt(i);
                count = 0;
            }
        }
        if (count > maxRepeats) {
            return 0;
        } else {
            return 1;
        }
    }

    int minLength;
    int maxRepeats;
    boolean isFirstState = false;
    boolean isSecondState = false;

    boolean isFirstConditions = false;
    boolean isSecondConditions = false;

    public void setMinLength(int minLength) {
        if (minLength <= 0) {
            throw new IllegalArgumentException("Не верное значение аргумента");
        } else {
            this.minLength = minLength;
            isFirstState = true;
        }
    }

    public void setMaxRepeats(int maxRepeats) {
        if (maxRepeats < 0 || maxRepeats == 0) {
            throw new IllegalArgumentException("Не верное значение аргумента!");
        } else {
            this.maxRepeats = maxRepeats;
            isSecondState = true;
        }
    }

    boolean verifyPassword(String password) {
        try {
            if (isFirstState && isSecondState) {
                if (checkRepeats(password, maxRepeats) == 1) {
                    isFirstConditions = true;
                } else if (checkRepeats(password, maxRepeats) == 0) {
                    isFirstConditions = false;
                }
                if (password.length() < minLength) {
                    isSecondConditions = false;
                } else {
                    isSecondConditions = true;
                }
            } else {
                throw new IllegalStateException("Ошибка состояния, не были указаны необходимые условия для пароля!");

            }
        } catch (Exception e) {
        }
        if (isFirstConditions && isSecondConditions) {
            System.out.println("Подходит!");
            return true;
        } else {
            System.out.println("Не подходит!");
            return false;
        }
    }
}
