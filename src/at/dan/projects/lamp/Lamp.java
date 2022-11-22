package at.dan.projects.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private int Glowelemts;
    private List<Lamp> lamps;

    public Lamp (int Glowelemts){
        this.Glowelemts = Glowelemts;
        this.lamps = new ArrayList<>();
    }

    public int getGlowelemts() {
        return Glowelemts;
    }

    public void setGlowelemts(int glowelemts) {
        Glowelemts = glowelemts;
    }

    public void addLamp(Lamp Lamp){
        this.lamps.add(Lamp);
    }

    public List<Lamp> getLamps() {
        return lamps;
    }

    public void setLamps(List<Lamp> lamps) {
        this.lamps = lamps;
    }
}
