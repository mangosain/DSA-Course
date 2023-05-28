import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.print("Enter another number: ");
        int b = scanner.nextInt();

        System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));

        scanner.close();
    }
}