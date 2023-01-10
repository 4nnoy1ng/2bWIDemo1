package at.dan.oo.projects.cars;

public class Car {
    private int range;
    private String color;
    private int maximumSpeed;
    private int basePrice;
    private int baseConsumption;
    private double manufacturerDiscount;

    public Car(String c, int mS, int bP, int bC) {
        this.color = c;
        this.maximumSpeed = mS;
        this.basePrice = bP;
        this.baseConsumption = bC;
    }

    public void Price(){
        this.basePrice = 200000;
        this.manufacturerDiscount = 3.0;
        this.baseConsumption = 7;
        this.range = 18000;
        if (this.range < 50000) {
            System.out.println(this.baseConsumption);
        } else if (this.range >= 50000){
            System.out.println(this.baseConsumption * 9.8);
        }


        double discountprice = (this.basePrice/this.manufacturerDiscount);
        double endprice = this.basePrice - discountprice;
        System.out.println("Das Auto kostet " + endprice + "€");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getBaseConsumption() {
        return baseConsumption;
    }

    public void setBaseConsumption(int baseConsumption) {
        this.baseConsumption = baseConsumption;
    }
}
