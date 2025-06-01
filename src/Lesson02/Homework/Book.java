package Lesson02.Homework;

public class Book {

    String title;
    String author;
    int year;
    boolean isIssued;
    // Конструктор
    public Book(String title, String author, int year, boolean isIssued) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isIssued = isIssued;
    }
    // Метод для печати информации о книге

    public void PrintInfo(){
        System.out.println( " Название книги : " + title);
        System.out.println( " Автор книги  : " +  author);
        System.out.println(" Год издания  : " +  year);
        System.out.println(" Книга выдана : " +  isIssued);
        System.out.println("------------------------------------------------------------------------");


    }
}
