import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int n = scanner.nextInt();

        if (n % 4 == 0) {
            if (n % 100 != 0) {
                System.out.println(n + " is leap year");
            } else {
                if (n % 400 == 0) {
                    System.out.println(n + " is leap year");
                }
                else {
                    System.out.println(n + " is not a leap year");
                }
            }
        }

        scanner.close();
    }
}
