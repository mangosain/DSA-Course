public class BinomialCoefficient {
    public static void main(String[] args) {
        int n = 10;
        int r = 5;
        binom(n, r);
    }

    public static void binom(int n, int r) {
        int p = factorial(n - r);
        n = factorial(n);
        r = factorial(r);

        System.out.println(n / (r * p));
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
   }
}
