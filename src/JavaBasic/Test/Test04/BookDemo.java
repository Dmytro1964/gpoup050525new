package JavaBasic.Test.Test04;

public class BookDemo {
    public static void main(String[] args) {
         Book book1 = new Book("Незнайка", "Носов ", true);
         Book book2 = new Book(" Lauthenzak Brothers", " Feihtvanger ", false);

         System.out.println( book1);
         book1.isBookIssued();
         System.out.println(book1);
         System.out.println(book2);
         book2.isBookIssued();
         System.out.println(book2);
    }
}
