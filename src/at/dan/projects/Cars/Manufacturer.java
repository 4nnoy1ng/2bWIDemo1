package at.dan.projects.Cars;

public class Manufacturer {
    private int basePrice;
    private String manufacturername;
    private String manufacturerCountry;
    private double manufacturerDiscount;

    public Manufacturer(String mn, String mC, double mD){

    }

    public void getPrice() {
        this.basePrice = 200000;
        this.manufacturerDiscount = 3.0;
        System.out.println((this.basePrice/this.manufacturerDiscount)*100);
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
