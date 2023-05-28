import java.util.Scanner;

public class AverageOf25Exams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 25; i++) {
            System.out.print("Enter the marks for exam: ");
            int n = scanner.nextInt();

            sum += n;
        }

        System.out.println("The total sum is: " + sum);
        System.out.println("The average is: " + (sum / 25));

        scanner.close();
    }
}
