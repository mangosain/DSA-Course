
public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String str = "aaaabbbaaaccddccccdeeddde";

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void removeDuplicates(String str, int i, StringBuilder sb, boolean[] arr) {
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }

        char ch = str.charAt(i);
        if (arr[ch - 'a'] == false) {
            arr[ch - 'a'] = true;
            sb.append(ch);
        }

        removeDuplicates(str, i + 1, sb, arr);
    }
}
