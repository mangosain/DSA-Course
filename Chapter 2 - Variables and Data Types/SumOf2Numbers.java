import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        System.out.print("Enter another enumber: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
