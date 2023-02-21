package at.dan.oo.projects.accounts;

public class BaseAccount {
    private double credit;

    public double getBalance() {
        return credit;
    }

    public void deposit(double amount){
        this.credit += amount;
    }

    public double withdraw(double amount){
        this.credit -= amount;
        return amount;
    }

}
