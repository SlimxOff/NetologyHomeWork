package netology.homework.homework5;

public class Author {
    String name;
    String surname;
    int rating;

    public Author(String name,String surname,int rating){
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }


    public String toString() {
        return "Имя автора: " + name + " | " + "Фамилия автора: " + surname + " | " + "Рейтинг автора: " + rating;
    }
}
