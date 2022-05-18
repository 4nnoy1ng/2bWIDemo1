import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 3, 2, 22, 8, 1};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        Arrays.parallelSort(arr, 0, 5);
        System.out.println("\nAfter Sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}