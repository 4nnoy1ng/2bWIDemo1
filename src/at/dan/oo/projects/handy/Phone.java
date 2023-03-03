package at.dan.oo.projects.handy;

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
    }

    public void doCall(String number){
        this.sim.doCall(number);
    }
}

