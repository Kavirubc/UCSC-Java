import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;
        do {
            System.out.println("Enter a number : ");
            num = scanner.nextInt();

            if (num % 2 != 0) {
                printPattern(num);
            }
        } while (num % 2 == 0);
    }

    public static void printPattern(int num) {
        for (int row = 0; row < num; row++) {
            for (int column = 0; column < num; column++) {
                if (row == column) { // Check for diagonal
                    System.out.print(" # ");
                } else {
                    if ((row + column) % 2 == 0) {
                        System.out.print(" * ");
                    } else {
                        System.out.print(" & ");
                    }
                }
            }
            System.out.println();
        }
    }

}
