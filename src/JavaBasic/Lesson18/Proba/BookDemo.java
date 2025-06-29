package JavaBasic.Lesson18.Proba;

public class BookDemo {
    public static void main(String[] args) {
      Book book1 = new Book("Мастер и Маргарита","Булгаков", 1938, true);
      Book book2 = new Book("Война и Мир", "Толстой", 1830, false);

      System.out.println(book1);
      System.out.println(book2);


    }
}
