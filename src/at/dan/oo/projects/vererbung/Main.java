package at.dan.oo.projects.vererbung;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("porsche",1121,"red");
        c1.setBrand("Porsche");
        c1.setSerialNr(11213);
        c1.setColor("White");

        c1.drive();
        c1.bremsen();

        Truck t1 = new Truck("Mercedes ",1331,"black","trailer1");

        System.out.println(t1.getBrand() + t1.getTrailer());
    }
}
