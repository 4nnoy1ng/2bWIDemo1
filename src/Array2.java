import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        int data[] = new int[50];
        int sum = 0;
        for (int i = 0; i <data.length; i++) {
            Random number = new Random();

            data[i] =  number.nextInt(100);

            sum = sum + data[i];

            }
            System.out.println("Array Sum = " + sum);
        }
    }
