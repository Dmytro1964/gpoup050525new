package Lesson20.Homework;

public class BookDemo {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository(100); // размер массива на 100 книг
        BookService service = new BookService(repository);
        UserInterface ui = new UserInterface(service);

        ui.start();
    }
}



