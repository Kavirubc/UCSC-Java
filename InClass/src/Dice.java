import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int player1Score = 0;
        int player2Score = 0;
        int winningScore = 100;
        boolean player1Turn = true;

        System.out.println("Welcome to the Roll-A-Dice Game!");
        System.out.println("First player to reach a score of 100 wins.");

        while (player1Score < winningScore && player2Score < winningScore) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int roundScore = dice1 + dice2;

            System.out.println((player1Turn ? "Player 1" : "Player 2") + "'s turn:");
            System.out.println("Rolled: " + dice1 + " and " + dice2);

            if (dice1 == 1 && dice2 == 1) {
                if (player1Turn) {
                    player1Score = 0;
                } else {
                    player2Score = 0;
                }
                System.out.println("Both dice rolled 1. " + (player1Turn ? "Player 1" : "Player 2") + "'s score reset to 0.");
            } else {
                if (player1Turn) {
                    player1Score += roundScore;
                    System.out.println("Player 1's score: " + player1Score);
                } else {
                    player2Score += roundScore;
                    System.out.println("Player 2's score: " + player2Score);
                }

                if (dice1 != dice2 || (dice1 == 1 && dice2 == 1)) {
                    player1Turn = !player1Turn;
                } else {
                    System.out.println("Same dice value, " + (player1Turn ? "Player 1" : "Player 2") + " gets another turn.");
                }
            }
            System.out.println();
        }

        System.out.println((player1Score >= winningScore ? "Player 1" : "Player 2") + " wins!");
        scanner.close();
    }
}
