public class Main {
    public static void main(String[] args) {


        Car c1 = new Car();
        c1.setBrand("Porsche");
        c1.setDrive("Yes");
        c1.setBrake("NO");
        c1.setFuelConsumption(28);
        c1.setSerialNumber("B19942");
        c1.setColor("blue";
        c1.setFuelAmount(100);
        c1.amountOfRepetitions = 3;


        Car c2 = new Car();
        c2.setBrand("Lamborgini");
        c2.setDrive("Yes");
        c2.setBrake("NO");
        c2.setFuelConsumption(11);
        c2.setSerialNumber("A12345");
        c2.setColor("red");
        c2.setFuelAmount(78);
        c2.amountOfRepetitions = 2;


        Car c3 = new Car(17,"Opel","ABCD1234!");



        c2.drive();
        c1.honk();
        c1.getRemainingRange();
        c2.getRemainingRange();

    }
}
