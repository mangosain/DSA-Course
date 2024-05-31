public class AllOccurances {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int[] result = allOccurances(arr, 0, 2, 0);
        // for (int i : result) {
        // System.out.print(i + " ");
        // }

        allOccurances(arr, 0, 2);
    }

    // public static int[] allOccurances(int[] arr, int i, int key, int pos) {
    // if (i == arr.length) {
    // return new int[pos];
    // }

    // if (arr[i] == key) {
    // int[] result = allOccurances(arr, i + 1, key, pos + 1);
    // result[pos] = i;
    // return result;
    // }

    // return allOccurances(arr, i + 1, key, pos);
    // }

    public static void allOccurances(int[] arr, int i, int key) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }

        allOccurances(arr, i + 1, key);
    }
}