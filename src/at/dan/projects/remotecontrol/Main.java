package at.dan.projects.remotecontrol;

public class Main {
    public static void main(String[] args) {

        RemoteControl rC1 = new RemoteControl();

        Battery b1 = new Battery(3.3, 80);
        Battery b2 = new Battery(3.3, 90);

        int getStatus = (b1.getCargingStatus() + b2.getCargingStatus())/2;
        int value = (b1.getCargingStatus() + b2.getCargingStatus()) / 20;

        int weakBattery1 = b1.getCargingStatus() - value;
        int weakBattery2 = b2.getCargingStatus() - value;

        

        System.out.println("Der Ladestatus ist " + getStatus + "%");
        System.out.println(weakBattery1);
        System.out.println(weakBattery2);



    }
}
