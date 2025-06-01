package Lesson03.Homework;

public class Book {

    String title;
    String author;
    boolean isIssued;

    public Book(String title, String author, boolean isIssued) {
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;

    }
    // Метод "выдачи" книги
    public void issueBook(){
        isIssued = true;}
    public void returnBook(){
        isIssued = false;
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
        return " Книга {" +
                " Название = '" + title + '\'' +
                ", Автор = '" + author + '\'' +
                ", Выдана? " + (isIssued ? " Да" : "Нет");



    }
}

