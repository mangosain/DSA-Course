import java.io.*;

public class KeypadCombinations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string of numbers: ");
        String str = br.readLine();

        combinations(str, 0, "");

        System.out.println("Total Combinations: " + count);
    }

    static String[] arr = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    static int count = 0;

    public static void combinations(String str, int i, String res) {
        if (i == str.length()) {
            count++;
            System.out.println(res);
            return;
        }

        int key = str.charAt(i) - '0';
        String keyStr = arr[key];

        for (int j = 0; j < keyStr.length(); j++) {
            combinations(str, i + 1, res + keyStr.charAt(j));
        }
    }
}