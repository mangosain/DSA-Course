public class LengthOfString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(lengthOfString(str));
    }

    public static int lengthOfString(String str) {
        if (str.equals("")) {
            return 0;
        }

        return 1 + lengthOfString(str.substring(1));
    }
}