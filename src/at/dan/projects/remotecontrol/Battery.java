package at.dan.projects.remotecontrol;

public class Battery {
    private double voltage;
    private int size;
    private double weight;
    private int cargingStatus;

    public Battery(double voltage, int cargingStatus) {
        this.voltage = voltage;
        this.cargingStatus = cargingStatus;
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

    public int getCargingStatus() {
        return cargingStatus;
    }

    public void setCargingStatus(int cargingStatus) {
        this.cargingStatus = cargingStatus;
    }
}
