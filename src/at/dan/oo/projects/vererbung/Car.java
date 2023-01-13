package at.dan.oo.projects.vererbung;

public class Car {
    private String brand;
    private int SerialNr;
    private String color;

    public Car(String brand,int SerialNr,String color){
        this.brand = brand;
        this.SerialNr = SerialNr;
        this.color = color;
    }

    public void drive(){
        System.out.println("Ich fahre!");
    }

    public void bremsen(){
        System.out.println("Ich bremse!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSerialNr() {
        return SerialNr;
    }

    public void setSerialNr(int serialNr) {
        SerialNr = serialNr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

