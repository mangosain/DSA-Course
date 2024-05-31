public class SumOfN {
    public static void main(String[] args) {
        System.out.println(sumN(6));
    }

    public static int sumN(int n) {
        if (n == 0) {
            return 0;
        }
        int snm1 = sumN(n - 1);
        int sn = n + sumN(n - 1);
        return sn;
    }
}
