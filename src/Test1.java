import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        boolean isFinished = false;
        int sum = 0;

        while (!isFinished){

            int number;
            Random random = new Random();
            number = random.nextInt(11);

            sum = sum + number;

            if (number == 5){
                isFinished = true;
            }

        }
        System.out.println(sum);
    }
}
