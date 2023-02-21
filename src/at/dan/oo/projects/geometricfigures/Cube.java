package at.dan.oo.projects.geometricfigures;

public class Cube {
    private String name;
    private int a;
    private  int b;

    public Cube(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public double getArea(int Area){
        Area = (a * b) * 6;
        return Area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}


