package JavaBasic.Test.Test03;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Незнайка на луне", "Носов", false);
        System.out.println( book1);
        book1.isBookIssued();
        System.out.println(book1);
    }
}
