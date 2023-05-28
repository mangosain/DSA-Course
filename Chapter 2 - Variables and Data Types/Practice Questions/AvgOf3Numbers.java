import java.util.Scanner;

public class AvgOf3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        System.out.print("Enter another number: ");
        int b = scanner.nextInt();

        System.out.print("Enter another number: ");
        int c = scanner.nextInt();
        float avg = (float) (a + b + c) / 3;

        System.out.println("The average is: " + avg);

        scanner.close();
    }
}
