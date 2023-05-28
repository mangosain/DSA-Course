import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in decimal form: ");
        int n = scanner.nextInt();

        System.out.println(convert(n));

        scanner.close();
    }

    public static int convert(int n) {
        int pow = 0, binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }

        return binNum;
    }
}
