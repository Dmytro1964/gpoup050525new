package JavaBasic.Proba.Test;

public class Books {

     private String title;
     private String author;
     private Boolean isIssued;

    public Books(String title, String author, Boolean isIssued) {
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }
    public void issuedBooks (){
        isIssued = true;
    }
    public void returnBooks(){
        isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Boolean getIssued() {
        return isIssued;
    }

    public void setIssued(Boolean issued) {
        isIssued = issued;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isIssued=" + isIssued +
                '}';
    }
}
