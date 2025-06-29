package JavaBasic.Test.Test03;

public class Book {

    private String title;
    private  String author;
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

    public boolean isBookIssued(){
        if(isIssued){
            System.out.println(" Книга " + title + author + " Книга выдана на руки ");
            return true;
        }
        else { System.out.println( " Книга находится в библиотеке ");
           return false;}
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isIssued=" + isIssued +
                '}';
    }
}
