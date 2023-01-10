package at.dan.oo.projects.remotecontrol;

public class RemoteControl {
    private int battery1;
    private int battery2;
    private boolean bON;



    public boolean isbON() {
        return bON;
    }

    public void setbON(boolean bON) {
        bON = true;
        this.bON = bON;
    }

    public int getBattery1() {
        return battery1;
    }

    public void setBattery1(int battery1, int battery2) {
        this.battery1 = battery1;
    }

    public int getBattery2() {
        return battery2;
    }

    public void setBattery2(int battery2) {
        this.battery2 = battery2;
    }
}

