import java.util.Random;
import java.util.SortedSet;

public class DiceGame {
    public static void main(String[] args) {
        int player = getSumOfRandomNumbers(6);
        System.out.println("-------");
        int computer = getSumOfRandomNumbers(6);

        System.out.println("Ihr Würfel = " + player);
        System.out.println("Computer's Würfel = " + computer);

        if (player==computer){
            System.out.println("Unentschieden!");
        }

        if (player<computer) {
            System.out.println("Verloren!");
        }

        if (player>computer) {
            System.out.println("Gewonnen!");
        }
    }

    public static int getSumOfRandomNumbers(int amountOfDices){
        int diceSumOfComputer = 0;
        for(int i = 0; i <amountOfDices; i++) {
            Random prandom1 = new Random();
            int randomNumber = prandom1.nextInt(6) + 1;
            System.out.println(randomNumber);
            diceSumOfComputer += randomNumber;
        }
        return diceSumOfComputer;
    }
}
