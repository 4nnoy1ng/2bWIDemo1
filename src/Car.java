public class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String drive;
    public String brake;
    public String serialNumber;
    public String color;
    public int amountOfRepetitions;

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

    public void Car(int fuelConsumption, String brand, String serialNumber) {

    }
}
