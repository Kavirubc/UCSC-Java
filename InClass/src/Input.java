
import java.util.Scanner;
public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0){
            if (year%100 !=0 || year%400==0) {
                System.out.println("Leap Year");
            }
            else{
            System.out.println("Not");
            }
        }
        else{
        System.out.println("not");
        }
    }

}
