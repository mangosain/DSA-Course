public class SetIthBit {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;

        System.out.println(n | (1 << i));
    }
}
