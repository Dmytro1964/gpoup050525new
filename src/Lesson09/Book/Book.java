package Lesson09.Book;

public class Book {

    private String name;
    private String autHor;

    public Book(String name, String autHor) {
        this.name = name;
        this.autHor = autHor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autHor='" + autHor + '\'' +
                '}';
    }
}
