import java.util.Random;
import java.util.Scanner;
public class DiceAgain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random  = new Random();

        int player1Score = 0;
        int player2Score = 0;
        int highScore = 100;


        System.out.println("Welcome to the Roll-A-Dice Game!");
        System.out.println("First player to reach a score of 100 wins.");

        while (player1Score > highScore && player2Score > highScore ){
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6)+ 1;

            int roundScore = dice1 + dice2;


        }

    }

}
