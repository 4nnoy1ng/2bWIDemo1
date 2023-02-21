package at.dan.oo.projects.accounts;

public class Main {
    public static void main(String[] args) {
    BaseAccount ba = new BaseAccount();
    CheckingsAccount ca = new CheckingsAccount(5000);
    ca.deposit(1000);
    ca.withdraw(6000);
    System.out.println(ca.getBalance());
    SavingsAccount sa = new SavingsAccount();
    }
}
