public class FindSubsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, 0, "");
    }

    public static void findSubset(String str, int i, String res) {
        if (i == str.length()) {
            if (res == "") {
                System.out.println("null");
            } else {
                System.out.println(res);
            }
            return;
        }

        findSubset(str, i + 1, res + str.charAt(i));
        findSubset(str, i + 1, res);
    }
}
