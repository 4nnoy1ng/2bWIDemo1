
package at.dan.projects.lamp;

import at.dan.projects.lamp.Glowelements;


public class Main {
    public static void main(String[] args){
        Lamp l1 = new Lamp();
        Glowelements ge1 = new Glowelements("Eins","Weiß");
        Glowelements ge2 = new Glowelements("Zwei","Blau");
        Glowelements ge3 = new Glowelements("Drei","Grün");
        Glowelements ge4 = new Glowelements("Vier","Rot");
        Glowelements ge5 = new Glowelements("Fünf","Orange");

        l1.addLightElement(ge1);
        l1.addLightElement(ge2);

        ge1.turnOn();
        ge2.turnOn();
        ge2.turnOff();

        System.out.println(l1.getOverallPowerUsage());
        System.out.println(l1.printNamesOfLightElemets());

    }
}
