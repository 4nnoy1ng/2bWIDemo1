import java.util.Random;

public class Switch_Statment {
    public static void main(String[] args){
        Random random =new Random();
        int randomNumber = random.nextInt(5);
        System.out.println(randomNumber);

        if (randomNumber == 0){
            System.out.println("Zero");
        }
        if (randomNumber == 1){
            System.out.println("One");
        }
        if (randomNumber == 2){
            System.out.println("Two");
        }
        if (randomNumber == 3) {
            System.out.println("Three");
        }
        if (randomNumber == 4){
            System.out.println("Four");
        }
        if (randomNumber == 5){
            System.out.println("Five");
        }
    }
}