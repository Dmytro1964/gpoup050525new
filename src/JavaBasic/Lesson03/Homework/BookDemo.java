package JavaBasic.Lesson03.Homework;

import JavaBasic.Lesson17.Homework.UserInputStatic;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book(" Мастер и Маргарита  "," М.А. Булгаков  ",  false);
        Book book2 = new Book(" Преступление и наказание "," Ф.М.Достоевский ", true);

        book1.issueBook();
        book2.returnBook();



        System.out.println(book1);
        System.out.println(book2);

        System.out.println("Введите название книги");
        String bookName = UserInputStatic.scanner.nextLine();
        System.out.println( "Название книги : " + bookName);




    }

}
