import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in binary form: ");
        int n = scanner.nextInt();

        System.out.println(convert(n));

        scanner.close();
    }

    public static int convert(int n) {
        int pow = 0, decNum = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            n /= 10;
        }

        return decNum;
    }
}
