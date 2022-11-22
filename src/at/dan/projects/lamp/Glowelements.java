package at.dan.projects.lamp;

import java.util.ArrayList;

public class Glowelements {
    private String name;
    private String color;
    private double powerConsumption;
    private int status;

    public Glowelements(String name, String color, double powerConsumption, boolean status) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.status = 1;
    }

    public void turnON() {
        int On = 1;
        int Off = 0;
        this.powerConsumption = 0;
        if (Off == status) {
            this.powerConsumption = this.powerConsumption + 5;
        } else {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet");
        }
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

