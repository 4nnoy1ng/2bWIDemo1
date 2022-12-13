package at.dan.projects.lamp;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Glowelements {
    private String name;
    private String color;
    private double powerConsumption;
    private boolean isOn;

    public Glowelements(String name, String color) {
        this.name = name;
        this.color = color;
        this.isOn=false;
        this.powerConsumption=0.0;
    }

    public void turnOn() {
        if (!isOn) {
            this.powerConsumption = this.powerConsumption + 5;
            this.isOn = true;
            System.out.println("Mein Name ist " + this.name + "." + " " + this.isOn);
        } else {
            System.out.println("Bin schon an");
        }

    }

    public void turnOff(){
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isOn() {
        return isOn;
    }


}