package at.dan.projects.remotecontrol;

public class Battery {
    private int battery1;
    private int battery2;
    private double voltage;
    private int size;
    private double weight;
    private int chargingStatus;

    public Battery(double voltage, int chargingStatus) {
        this.voltage = voltage;
        this.chargingStatus = chargingStatus;
    }

    public void getStatus() {
        this.battery1 = 100;
        this.battery2 = 100;
        System.out.println("Der Ladestatus ist " + (this.battery1 + this.battery2) / 2 + "%");
    }

    public void turnON(){
        int turnON1 = this.battery1/20;
        int turnON2 = this.battery2/20;
        int battery1status = this.battery1 - turnON1;
        int battery2status = this.battery2 - turnON1;
        int result = (battery1status + battery2status)/2;

        System.out.println("Verbraucher angeschlossen " + result + "%");
    }

    public void turnOFF() {
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}