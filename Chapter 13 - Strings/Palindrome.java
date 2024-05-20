public class Palindrome {
    public static void main(String[] args) {
        String str = "girl";
        int n = str.length();
        boolean check = true;

        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                check = false;
                break;
            }
        }

        if (check) {
            System.out.println("Is a palidrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
