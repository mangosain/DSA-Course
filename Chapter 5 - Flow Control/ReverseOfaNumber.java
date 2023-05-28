import java.util.Scanner;

public class ReverseOfaNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int rev = 0, rem = 0;

        while (n != 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }

        System.out.println("The reversed number is: " + rev);

        scanner.close();
    }
}
