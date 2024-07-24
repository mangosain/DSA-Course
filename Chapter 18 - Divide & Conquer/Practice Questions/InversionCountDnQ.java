public class InversionCountDnQ {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 5 };
        System.out.println(inversionCount(arr, 0, arr.length - 1));
    }

    public static int inversionCount(int[] arr, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int mid = low + (high - low) / 2;
        int left = inversionCount(arr, low, mid);
        int right = inversionCount(arr, mid + 1, high);

        int count = 0;
        for (int i = low; i <= mid; i++) {
            for (int j = mid + 1; j <= high; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return left + right + count;
    }
}
