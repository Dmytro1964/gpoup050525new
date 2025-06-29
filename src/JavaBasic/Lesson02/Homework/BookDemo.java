package JavaBasic.Lesson02.Homework;

public class BookDemo {

    public static void main(String[] args) {
        // Создаём две книги

        Book book1 = new Book(" Мастер и Маргарита ", " Булгаков", 1938, true);
        Book book2 = new Book(" Война и Мир "," Толстой ", 1830, false);

        // Печатаем информацию о книгах

        book1.PrintInfo();
        book2.PrintInfo();


    }
}
