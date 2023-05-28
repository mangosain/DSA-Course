import java.util.Scanner;

public class ProductOf2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        System.out.print("Enter another enumber: ");
        int b = scanner.nextInt();

        int product = a * b;
        System.out.println("The sum is: " + product);

        scanner.close();
    }
}
