public class NumberToString {
    public static void main(String[] args) {
        numberToString(123);
    }

    static String[] digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void numberToString(int n) {
        if (n == 0) {
            return;
        }

        int lastDigit = n % 10;
        numberToString(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }
}
