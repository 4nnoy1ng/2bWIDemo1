package at.dan.projects.Cars;

import at.dan.oo.Engine;

public class Car {
    private String color;
    private int maximumSpeed;
    private int basePrice;
    private int baseConsumption;

    public Car(String c, int mS, int bP, int bC) {
        this.color = c;
        this.maximumSpeed = mS;
        this.basePrice = bP;
        this.baseConsumption = bC;
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
