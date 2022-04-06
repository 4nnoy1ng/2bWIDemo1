import java.util.Random;

public class While_Aufgabe_1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;

        while (!isFinished){
            int randomValue = 10;
            randomValue = random.nextInt(30);
            System.out.println("Nr:" + randomValue);

            if (randomValue==15){
                isFinished = true;
            }
            if (randomValue==25){
                isFinished = true;
            }
        }
    }
}
