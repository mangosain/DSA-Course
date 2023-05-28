import java.util.Scanner;

public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the largest");
            } else {
                System.out.println(c + " is the largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is the largest");
            } else {
                System.out.println(c + " is the largest");
            }
        }

        scanner.close();
    }
}
