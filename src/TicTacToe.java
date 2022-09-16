import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] playGround = new int [3][3];
        playGround [1][0] = "X";
        playGround [0][1] = "O";


        for (int row = 0; row < playGround.length; row++) {
            for (int col = 0; col < playGround.length; col++) {
                System.out.print(playGround[row][col]);

            }
            System.out.println();
        }
    }
}
