package at.dan.projects.lamp;

import java.util.ArrayList;
import java.util.List;

import static sun.security.ssl.SSLLogger.isOn;

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
        for (Glowelements element:this.glowElements) {
            element.turnOn();
        }
    }

    public int getOverallPowerUsage(){
        int sum = 0;
        for (Glowelements element: this.glowElements) {
            sum += element.getPowerConsumption();
        }
        return sum;
    }

    public String printNamesOfLightElemets() {
        String sum = "";
        for (Glowelements element : this.glowElements) {
            sum += element.getName() + " ";
        }
        return sum;
    }

    public List<Glowelements> getGlowElements() {
        return glowElements;
    }

    public void setGlowElements(List<Glowelements> glowElements) {
        this.glowElements = glowElements;
    }
}
