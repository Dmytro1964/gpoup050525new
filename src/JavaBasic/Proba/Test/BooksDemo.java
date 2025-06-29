package JavaBasic.Proba.Test;

public class BooksDemo {
    public static void main(String[] args) {

        Books book1 = new Books("HH","ll",true);
        Books book2 = new Books("kk","JJ", true);

        book1.issuedBooks();
        book2.returnBooks();

        System.out.println(book1);
        System.out.println(book2);

    }
}
