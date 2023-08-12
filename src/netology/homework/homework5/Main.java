package netology.homework.homework5;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Dima", "Kostrov", 4);

        Book book = new Book("NewLand", author, 2013, 450);

        Book book2 = new Book("Welcome to Mars", author, 2023, 731);

        Author author1 = new Author("Pavel","Severyanin",6);

        Book book3 = new Book("Little planet", author1, 2000, 20);

        System.out.println(author);
        System.out.println(book);
        System.out.println(book.matches("Dima"));
        System.out.println();

        System.out.println(author);
        System.out.println(book2);
        System.out.println(book2.matches("Kostrov"));
        System.out.println();

        System.out.println(author1);
        System.out.println(book3);
        System.out.println(book3.matches("Dima"));


    }


}
