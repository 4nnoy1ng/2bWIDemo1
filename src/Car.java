public class Car {
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String drive;
    private String brake;
    private String serialNumber;
    private String color;
    public int amountOfRepetitions;

    public Car(int fc, String b, String sn) {
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void bremsen(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if (fuelAmount > fuelAmount * 0.1);
        System.out.println("SuperBoostMode");
        if (fuelAmount < fuelAmount * 0.1);
        System.out.println("Not enough fuel to go to Superboost");
    }

    public void honk(){

        for (int i = 0; i < this.amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }

    public void getRemainingRange(){
        int range = (fuelAmount/fuelConsumption)*100;
        System.out.println(range +"km");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
