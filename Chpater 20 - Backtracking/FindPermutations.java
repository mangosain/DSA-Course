public class FindPermutations {
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }

    public static void permutation(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String temp = str.substring(0, i) + str.substring(i + 1);
            permutation(temp, res + currentChar);
        }
    }
}