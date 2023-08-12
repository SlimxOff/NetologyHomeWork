package netology.homework.homework6;

import java.util.Scanner;

public class Main {

    public static void showBasket(int numberOfProduct, int[] countOfProduct, int[] prices, String[] products) {
        System.out.println(products[numberOfProduct] + " " + countOfProduct[numberOfProduct] + " шт. " + prices[numberOfProduct] + " руб/шт. " + (countOfProduct[numberOfProduct] * prices[numberOfProduct]) + " руб. в сумме");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productNumber;
        int productCount;
        int sumProducts = 0;
        String[] products = {"Хлеб", "Молоко", "Клубника", "Чай"};
        int[] prices = {64, 89, 299, 50};
        int[] countOfProduct = new int[products.length];
        boolean[] isProductInBasket = new boolean[products.length];


        System.out.println("Список возможных товаров для покупки");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " руб/шт");
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите 'end' ");
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) {
                break;
            }
            String[] currentProduct = inputString.split(" ");
            productNumber = Integer.parseInt(currentProduct[0]);
            productCount = Integer.parseInt(currentProduct[1]);
            countOfProduct[productNumber] = productCount;
            isProductInBasket[productNumber] = true;
        }
        System.out.println("Ваша корзина:");
        for (int i = 0; i < isProductInBasket.length; i++) {
            if (isProductInBasket[i]) {
                showBasket(i, countOfProduct, prices, products);
            }
        }
        for (int i = 0; i < products.length; i++) {
            sumProducts += prices[i] * countOfProduct[i];
        }
        System.out.println("Вся стоимость корзины: " + sumProducts + " руб.");
    }
}
