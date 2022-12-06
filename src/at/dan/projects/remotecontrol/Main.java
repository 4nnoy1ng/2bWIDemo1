package at.dan.projects.remotecontrol;

public class Main {
    public static void main(String[] args) {

        RemoteControl rC1 = new RemoteControl();

        Battery b1 = new Battery(3.3, 100);
        b1.getStatus();
        b1.turnON();
        b1.turnOFF();
    }
}
