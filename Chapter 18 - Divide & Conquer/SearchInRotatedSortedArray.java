public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2, 3 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[low] <= arr[mid]) {
            if (target >= arr[low] && target <= arr[mid]) {
                return search(arr, target, low, mid - 1);
            } else {
                return search(arr, target, mid + 1, high);
            }
        } else {
            if (target >= arr[mid] && target <= arr[high]) {
                return search(arr, target, mid + 1, high);
            } else {
                return search(arr, target, low, mid - 1);
            }
        }
    }
}