package JavaBasic.Test.Test01;

public class NewBook {

    String name;
    String author;
    int year;
    boolean isisIssued;

    public NewBook(String name, String author, int year, boolean isisIssued) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.isisIssued = isisIssued;
    }

    @Override
    public String toString() {
        String status = isisIssued ? "выдана" : "доступна";
        return "Новая книга: " +
                "название : " + name +
                ", Автор : " + author +
                ", Год выпуска : " + year +
                ", Статус : " + status;
    }
}



