package at.dan.oo.projects.vererbung;

import java.io.Serial;

public class Truck extends Car {
    private String trailer;


    public Truck(String brand, int SerialNr, String color, String trailer) {
        super(brand, SerialNr, color);
        this.trailer = trailer;
    }

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void bremsen() {
        super.bremsen();
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
