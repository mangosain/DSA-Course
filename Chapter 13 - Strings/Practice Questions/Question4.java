import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lohel";

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if (Arrays.equals(charArr1, charArr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
