package JavaBasic.Test.Test05;

public class Maker {

    private String mark;
    private String country;

    public Maker(String mark, String country) {
        this.mark = mark;
        this.country = country;
    }

    public String getMark() {
        return mark;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Maker{" +
                "mark='" + mark + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
