package at.dan.projects.lamp;

import java.util.ArrayList;
import java.util.List;

/** addLightElement(LightElement):void um ein Glühelement dazu zu geben.



 turnAllOn():void - Da werden alle Glühelemente eingeschaltet.



 getOverallPowerUsage(): double - Liefert den bisher verbrauchten Strom aller Glühelemente zurück.



 printNamesOfLightElements():void - Printet die Namen aller Lichtelemen auf die Konsole.

 **/

public class Lamp {
    private List<Glowelements> glowElements;


    public Lamp() {
        this.glowElements = new ArrayList<>();

    }

    public void addLightElement(Glowelements element) {
        this.glowElements.add(element);
    }

    public void tunrAllOn(){

    }

    public int getOverallPowerUsage(){
        int sum = 0;
        for (Glowelements element: this.glowElements) {
            sum += element.getPowerConsumption();
        }
        return sum;
    }

    public void printNamesOfLightElemets(){
        Sti
        for (Glowelements element: this.glowElements) {
            sum += element.getPowerConsumption();
        }
    }

    public List<Glowelements> getGlowElements() {
        return glowElements;
    }

    public void setGlowElements(List<Glowelements> glowElements) {
        this.glowElements = glowElements;
    }
}
