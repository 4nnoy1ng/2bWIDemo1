import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        boolean isFinished = false;

        int balance = 0;
        int amount = 0;

        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Beenden");

        while (!isFinished) {

            Scanner scanner = new Scanner(System.in);
            int Selection = scanner.nextInt();

            if (Selection == 1) {
                System.out.println("Wie viel wollen Sie einzahlen?");
                amount = scanner.nextInt();
                balance += amount;
                System.out.println("Amount:" + amount);

            }

            if (Selection == 2) {
                System.out.println("Wie viel wollen Sie abheben?");
                amount = scanner.nextInt();
                balance -= amount;
                System.out.println("Amount:" + amount);

            }

            if (Selection == 3) {
                {
                    System.out.println(balance);
                }
            }
            if (Selection == 4) {
               isFinished=true;
            }
        }
    }
}


