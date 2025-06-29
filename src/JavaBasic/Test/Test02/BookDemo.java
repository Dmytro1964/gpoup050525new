package JavaBasic.Test.Test02;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Незнайка", " Носов ", true);
        Book book2 = new Book("Война и мир ", " Толстой ", false);

        book1.isBookIssued();
        book2.isBookIssued();

        book1.isBookReturned();
        book2.isBookReturned();




    }
}