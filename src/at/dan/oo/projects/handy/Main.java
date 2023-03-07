package at.dan.oo.projects.handy;

public class Main {
    public static void main(String[] args) {
        SimCard sim = new SimCard(1, 0650123);
        MemoryCard card = new MemoryCard(15000);
        Camera cam = new Camera();

        Phone phone = new Phone(sim, cam, card);
        phone.doCall("+43 0681 20562270");

        phone.takePicture();
        phone.takePicture();

        phone.printAllFiles();

        System.out.println(phone.getFreeSpace());
        phone.takePicture();
        System.out.println(phone.getFreeSpace());
    }
}


