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
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) { // Check for diagonal
                    System.out.print("#");
                } else {
                    if ((i + j) % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("&");
                    }
                }
            }
            System.out.println();
        }
    }

}
