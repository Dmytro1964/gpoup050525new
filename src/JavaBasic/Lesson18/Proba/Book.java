package JavaBasic.Lesson18.Proba;

public class Book {
    String bookName;
    String bookAuthor;
    int bookYear;
    boolean isIssued;

    public Book(String bookName, String bookAuthor, int bookYear, boolean isIssued) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.isIssued = isIssued;
    }
    // метод для печати книги

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookYear=" + bookYear +
                ", isIssued=" + isIssued +
                '}';
    }
}
