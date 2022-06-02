import java.util.Random;

public class Test {
    public static void main(String[] args) {

        Random random1 =new Random();
        int randomNumber1 = random1.nextInt(1000);
        System.out.println(randomNumber1);

        Random random2 =new Random();
        int randomNumber2 = random2.nextInt(1000);
        System.out.println(randomNumber2);


        if (randomNumber1 == randomNumber2) {
            System.out.println(randomNumber1);
        }

        if (randomNumber1 > randomNumber2)
            for (int i = randomNumber1; i > randomNumber2; i--) {
                System.out.println(i);
            }

            if (randomNumber1 < randomNumber2)
                for (int i = randomNumber2; i < randomNumber1; i--) {
                    System.out.println(i);
                }
            }
        }


