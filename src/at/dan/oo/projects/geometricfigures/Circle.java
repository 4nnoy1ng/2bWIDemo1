package at.dan.oo.projects.geometricfigures;

public class Circle {
    private String name;
    private double radius;


    public Circle(String name, double Area) {
        this.name = name;
        this.radius = radius;
    }

    public double getArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}