import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter number two: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter operation: ");
        char op = scanner.next().charAt(0);

        if(op == '+'){
            int sum = num2+num1;
            System.out.println("Sum = "+ sum);
        } else if (op == '-') {
            int sum = num2-num1;
            System.out.println("Num = "+ sum);

        }else {
            System.out.println("Enter + or -");
        }


    }
}
