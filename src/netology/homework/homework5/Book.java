package netology.homework.homework5;

public class Book {
    String title;
    Author author;
    int releaseYear;
    int pages;

    public Book(String title, Author author, int releaseYear, int pages){
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pages = pages;
    }

    public String isBig(int pages) {
        return pages > 500 ? "Книга является большой" : "Книга является не большой" ;
    }

    public boolean matches(String word) {
        return author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrice(int pages, Author author) {
        int price = (int) Math.floor(((pages * 3) * Math.sqrt(author.rating)));
        return (price < 250) ? 250 : price;
    }


    public String toString() {
        return "Название книги: " + title + " | " + "Год выпуска: " + releaseYear + " | " + "Цена книги: " + estimatePrice(pages,author) + " | " + isBig(pages);
    }
}
