public class ClearIBits {
    public static void main(String[] args) {
        int n = 15;
        int i = 2;
        int mask = (-1 << i);
        int result = n & mask;
        System.out.println(result);
    }
}
