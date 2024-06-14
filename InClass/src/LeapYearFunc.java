import java.util.Scanner;
public class LeapYearFunc {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year;
        year = scanner.nextInt();
        boolean leap = isLeapYear(year);

        if (leap){
            System.out.println("This is a leap year");
        } else {
            System.out.println("Not a leap year");
        }

    }

    public static boolean isLeapYear(int year){
        if (year % 4 == 0){
            if (year%100 !=0 || year%400==0) {
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
