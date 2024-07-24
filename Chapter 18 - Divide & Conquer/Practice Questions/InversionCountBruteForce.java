public class InversionCountBruteForce {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        System.out.println(inversionCount(arr, 0, arr.length - 1));
    }

    public static int inversionCount(int[] arr, int low, int high) {
        int count = 0;
        for (int i = low; i < high; i++) {
            for (int j = i + 1; j <= high; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
