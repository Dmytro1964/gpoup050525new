package JavaBasic.Test.Test04;

public class Book {

    private String title;
    private String author;
    private boolean isIssued;

    public Book(String title, String author, boolean isIssued) {
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void setIssued(boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isIssued=" + isIssued +
                '}';
    }

    public  boolean isBookIssued(){
        if( isIssued){
            System.out.println( " Книга" + title + author + " выданa ");
            return true;

        }
        else {System.out.println( " Книга" + title + author + " находится в библиотоке ");
        return false; }

    }
}
