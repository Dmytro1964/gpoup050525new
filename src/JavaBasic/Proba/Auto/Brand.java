package JavaBasic.Proba.Auto;

public class Brand {

   private String brandName;
   private String brandCountry;

    public Brand(String brandName, String brandCountry) {
        this.brandName = brandName;
        this.brandCountry = brandCountry;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandCountry() {
        return brandCountry;
    }

    public void setBrandCountry(String brandCountry) {
        this.brandCountry = brandCountry;
    }

    @Override
    public String toString() {
        return
                brandName + " (" + brandCountry + ")";
    }
}
