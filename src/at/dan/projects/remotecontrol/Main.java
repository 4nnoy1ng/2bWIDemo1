package at.dan.projects.remotecontrol;

public class Main {
    public static void main(String[] args) {

        RemoteControl rC1 = new RemoteControl();



        Batterys Ba1 = new Batterys(100,100);
        Ba1.getAverage();

        System.out.println(Ba1.getAverage());

    }


}
