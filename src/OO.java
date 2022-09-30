public class OO {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Porsche";
        c1.drive = "Yes";
        c1.brake = "No";
        c1.fuelConsumption = 7;
        c1.serialNumber = "B19942";
        c1.color = "blue";
        c1.fuelAmount = 80;


        Car c2 = new Car();
        c2.brand = "Lamborgini";
        c2.drive = "Yes";
        c2.brake = "No";
        c2.fuelConsumption = 10;
        c2.serialNumber = "A12345";
        c2.color = "red";
        c2.fuelAmount = 90;

        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);

        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);

    }
}
