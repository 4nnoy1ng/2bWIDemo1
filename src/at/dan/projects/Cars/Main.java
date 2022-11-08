package at.dan.projects.Cars;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("red", 361, 200000, 11);
        Manufacturer m1 = new Manufacturer("Ford", "United States of America",3.0);
        c1.Price();
    }
}
