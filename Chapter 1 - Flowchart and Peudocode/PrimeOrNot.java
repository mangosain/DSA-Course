import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (check(n)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        scanner.close();
    }

    public static boolean check(int n) {
        for (int i = 2; i < n - 1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
