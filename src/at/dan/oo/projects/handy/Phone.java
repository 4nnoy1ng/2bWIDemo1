package at.dan.oo.projects.handy;

import java.util.List;

public class Phone {
    private SimCard sim;
    private Camera cam;
    private MemoryCard card;

    public Phone(SimCard sim, Camera cam, MemoryCard card) {
        this.sim = sim;
        this.cam = cam;
        this.card = card;
    }

    public void takePicture(){
        PhoneFile file = this.cam.takePicture();
        System.out.println(file.getName());
        this.card.save(file);
    }

    public void doCall(String number){
        this.sim.doCall(number);
    }

    public int getFreeSpace(){
        return this.card.getFreeSpace();
    }

    public void printAllFiles() {
        List<PhoneFile> files = this.card.getFiles();
        for (PhoneFile file : files) {
            System.out.println(file.getInfo());
            
        }

    }
}

