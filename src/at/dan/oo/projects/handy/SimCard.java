package at.dan.oo.projects.handy;

public class SimCard {
    private int id;
    private int phoneNumber;

    public SimCard(int id, int phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void doCall(String number) {
        System.out.println("Call incoming"+ " " + number);
    }
}


