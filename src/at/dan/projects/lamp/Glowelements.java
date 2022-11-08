package at.dan.projects.lamp;

public class Glowelements {
    private String name;
    private String color;
    private double powerConsumption;
    private boolean status;

    public Glowelements(String name, String color, double powerConsumption, int status) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.status = false;
    }

    public boolean turnON() {
        this.powerConsumption = 0;
        if (this.status == false) {
            this.status = true;
            this.powerConsumption = this.powerConsumption + 5;
        } else {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet");
        }
        return true;
    }
}

