package Lesson20.Homework;

import java.util.Scanner;

public class UserInterface {
    private BookService bookService;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface(BookService bookService) {
        this.bookService = bookService;
    }

    public void start() {
        boolean exit = false;

        while (!exit) {
            printMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> searchById();
                case 3 -> searchByTitle();
                case 4 -> searchByAuthor();
                case 0 -> {
                    System.out.println("До свидания!");
                    exit = true;
                }
                default -> System.out.println("Неверный ввод. Повторите.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n=== Меню ===");
        System.out.println("1. Добавить книгу");
        System.out.println("2. Найти книгу по ID");
        System.out.println("3. Найти книгу по названию");
        System.out.println("4. Найти книги по автору");
        System.out.println("0. Выход");
        System.out.print("Выберите пункт меню: ");
    }

    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Введите число!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void addBook() {
        scanner.nextLine(); // очистка буфера

        System.out.print("Введите ID книги: ");
        String id = scanner.nextLine();

        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();

        System.out.print("Введите автора книги: ");
        String author = scanner.nextLine();

        Book newBook = new Book(id, title, author);
        boolean success = bookService.addNewBook(newBook);

        if (success) {
            System.out.println("Книга успешно добавлена.");
        } else {
            System.out.println("Ошибка: книга не была добавлена (возможно, дубликат ID или названия).");
        }
    }

    private void searchById() {
        scanner.nextLine(); // очистка буфера
        System.out.print("Введите ID книги для поиска: ");
        String id = scanner.nextLine();
        Book found = bookService.findBookById(id);

        if (found != null) {
            System.out.println("Найдена книга: " + found);
        } else {
            System.out.println("Книга с таким ID не найдена.");
        }
    }

    private void searchByTitle() {
        scanner.nextLine();
        System.out.print("Введите название книги для поиска: ");
        String title = scanner.nextLine();
        Book found = bookService.findBookByTitle(title);

        if (found != null) {
            System.out.println("Найдена книга: " + found);
        } else {
            System.out.println("Книга с таким названием не найдена.");
        }
    }

    private void searchByAuthor() {
        scanner.nextLine();
        System.out.print("Введите имя автора: ");
        String author = scanner.nextLine();
        Book[] books = bookService.findBooksByAuthor(author);

        if (books.length > 0) {
            System.out.println("Найдены книги автора " + author + ":");
            for (Book b : books) {
                System.out.println(b);
            }
        } else {
            System.out.println("Книги этого автора не найдены.");
        }
    }
}

