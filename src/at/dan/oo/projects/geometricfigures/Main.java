package at.dan.oo.projects.geometricfigures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Circle c1 = new Circle("Circle1",5);
    System.out.println(c1.getArea(5));

    square s1 = new square("Square1",2,2);
    System.out.println(s1.getArea(0));

    Cube cu1 = new Cube("Cube1",2,2);
    System.out.println(cu1.getArea(0));

    rectangle r1 = new rectangle("rectangle1",2,3);
    System.out.println(r1.getArea(0));
    }
}
