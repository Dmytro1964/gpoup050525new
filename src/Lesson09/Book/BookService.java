package Lesson09.Book;

import java.util.Scanner;

public class BookService {

    public Book createBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите название книги :");
        String bookTitle = scanner.nextLine();

        System.out.println(" Введите Author");
        String bookAuthor = scanner.nextLine();

        Book book = new Book(bookTitle,bookAuthor);

        return book;



    }
}
