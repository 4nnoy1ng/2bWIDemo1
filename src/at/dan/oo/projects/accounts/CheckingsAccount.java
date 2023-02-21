package at.dan.oo.projects.accounts;

public class CheckingsAccount extends BaseAccount{
    private int max;

    public CheckingsAccount(int max) {
        this.max = max;
    }

    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount)>(max * -1)){
            System.out.println("Widthdrawn " + amount + " €");
            return super.withdraw(amount);
        }else {
            System.out.println("Leider keine Deckung");
            return 0;
        }


    }
}
