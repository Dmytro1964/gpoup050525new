package JavaBasic.Lesson09.Book;

public class BookDemo {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Book myBook = bookService.createBook();
        System.out.println(myBook);

        Book myBook2 = bookService.createBook();
        System.out.println(myBook2);


    }
}
