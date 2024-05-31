public class GetIthBit {
    public static void main(String[] args) {
        int n = 10;
        int i = 3;

        String res = (n & (1 << i)) == 0 ? "0" : "1";

        System.out.println(res);
    }
}
