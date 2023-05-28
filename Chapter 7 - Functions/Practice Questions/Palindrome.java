import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        check(n);

        scanner.close();
    }

    public static void check(int n) {
        int m = n;
        int rev = 0;

        while (m != 0) {
            int rem = m % 10;
            rev = rev + (rem * 10);
            m /= 10;
        }

        System.out.println(rev);
    }
}
