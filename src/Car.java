public class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String drive;
    public String brake;
    public String serialNumber;
    public String color;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void bremsen(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if ()
    }
}
