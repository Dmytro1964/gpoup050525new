package JavaBasic.Test.Test02;

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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isIssued=" + isIssued +
                '}';
    }
    public boolean isBookIssued(){
        if(isIssued == false){
            System.out.println("Книга " + title + author + " Находится в библиотеке ");
            return false;
        }
        else { System.out.println("Книга " + title + author + " Выдана на руки ");}
        return true;
    }
    public boolean isBookReturned(){
        if( isIssued == false){
            System.out.println("Книга " + title + author + " Сдана в библиотеку ");
            return false;
        }
        else { System.out.println("Книга " + title + author + " Находится на руках  ");}
        return true;
    }
}
