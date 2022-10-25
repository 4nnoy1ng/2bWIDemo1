package at.dan.projects.Cars;

import at.dan.projects.Cars.Car;

import static at.dan.oo.Engine.TYPE.DIESEL;

public class Main {
    Car c1 = new Car("red", 361, 200000, 11);
    Engine e1 = new Engine(200, DIESEL);
    Manufacturer m1 = new Manufacturer("Ford", "United States of America",3.0);

    m1.getPrice();
}
