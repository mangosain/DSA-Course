public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 5;

        String res = (n & 1) == 0 ? "Even" : "Odd";

        System.out.println(res);
    }
}
