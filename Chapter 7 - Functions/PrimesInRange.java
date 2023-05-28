import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter starting point: ");
        int start = scanner.nextInt();

        System.out.print("Enter ending point: ");
        int end = scanner.nextInt();

        range(start, end);

        scanner.close();
    }

    public static void range(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (check(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean check(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
