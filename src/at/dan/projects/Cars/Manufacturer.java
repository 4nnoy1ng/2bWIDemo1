package at.dan.projects.Cars;

public class Manufacturer {
    private int basePrice;
    private String manufacturername;
    private String manufacturerCountry;
    private double manufacturerDiscount;

    public Manufacturer(String mn, String mC, double mD){
        this.manufacturername = mn;
        this.manufacturerCountry = mC;
        this.manufacturerDiscount = mD;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public String getManufacturername() {
        return manufacturername;
    }

    public void setManufacturername(String manufacturername) {
        this.manufacturername = manufacturername;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public double getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(double manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
}
