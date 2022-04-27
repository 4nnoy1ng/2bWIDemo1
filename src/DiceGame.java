import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {


        Random prandom1 =new Random();
        int playerNumber1 = prandom1.nextInt(6) +1;
        System.out.println(playerNumber1);

        Random prandom2 =new Random();
        int playerNumber2 = prandom2.nextInt(6) +1;
        System.out.println(playerNumber2);

        Random prandom3 =new Random();
        int playerNumber3 = prandom3.nextInt(6) +1;
        System.out.println(playerNumber3);

        Random prandom4 =new Random();
        int playerNumber4 = prandom4.nextInt(6) +1;
        System.out.println(playerNumber4);

        Random prandom5 =new Random();
        int playerNumber5 = prandom5.nextInt(6) +1;
        System.out.println(playerNumber5);

        Random prandom6 =new Random();
        int playerNumber6 = prandom6.nextInt(6) +1;
        System.out.println(playerNumber6);

        Random computerNumberRandom1 =new Random();
        int computerNumber1 = computerNumberRandom1.nextInt(6) +1;
        System.out.println(computerNumber1);

        Random computerNumberRandom2 =new Random();
        int computerNumber2 = computerNumberRandom2.nextInt(6) +1;
        System.out.println(computerNumber2);

        Random computerNumberRandom3 =new Random();
        int computerNumber3 = computerNumberRandom3.nextInt(6) +1;
        System.out.println(computerNumber3);

        Random computerNumberRandom4 =new Random();
        int computerNumber4 = computerNumberRandom4.nextInt(6) +1;
        System.out.println(computerNumber4);

        Random computerNumberRandom5 =new Random();
        int computerNumber5 = computerNumberRandom5.nextInt(6) +1;
        System.out.println(computerNumber5);

        Random computerNumberRandom6 =new Random();
        int computerNumber6 = computerNumberRandom6.nextInt(6) +1;
        System.out.println(computerNumber6);

        int playerNumber = (playerNumber1 + playerNumber2 + playerNumber3 + playerNumber4 + playerNumber5 + playerNumber6);
        int computerNumber = (computerNumber1 + computerNumber2 + computerNumber3 + computerNumber4 + computerNumber5 + computerNumber6);

        if (playerNumber>computerNumber) {
            System.out.println("Du hast gewonnen!");
        }
        if (computerNumber>playerNumber) {
            System.out.println("Du hast verloren!");
        }
        if (playerNumber==computerNumber) {
            System.out.println("Unentschieden!");
        }
    }
}
