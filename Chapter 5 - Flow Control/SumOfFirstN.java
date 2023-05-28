import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
        }

        System.out.println("The final sum of " + n + " numbers is: " + sum);
        
        scanner.close();
    }
}
