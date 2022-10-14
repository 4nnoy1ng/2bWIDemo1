package at.dan.projects.remotecontrol;

public class Batterys {
    private int battery1;
    private int battery2;
    private int Average;

    public Batterys(int battery1, int battery) {
        int batterys = (battery1 + battery2)/2;
    }

    public int getBattery1() {
        return battery1;
    }

    public void setBattery1(int battery1) {
        if (battery1 > 100){
            this.battery1 = 100;
        } else {
            this.battery1 = battery1;
        }

    }

    public int getBattery2() {
        return battery2;
    }

    public void setBattery2(int battery2) {
        if (battery2 > 100){
            this.battery2 = 100;
        } else {
            this.battery2 = battery2;
        }
    }

    public int getAverage() {

        Average = (battery1 + battery2)/2;
        return Average;
    }

    public void setAverage(int average) {
        average = (this.battery1 + this.battery2)/2;
    }
}