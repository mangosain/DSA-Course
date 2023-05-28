import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        String res = (n > 0) ? "Positive" : "Negative";
        System.out.println("The number is: " + res);

        scanner.close();
    }
}
