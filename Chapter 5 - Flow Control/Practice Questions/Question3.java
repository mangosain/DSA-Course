import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int fact = 1;

        while (n != 0) {
            fact *= n;
            n -= 1;
        }

        System.out.println("The factorial is: " + fact);

        scanner.close();
    }
}
