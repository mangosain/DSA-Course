public class StringMergeSort {
    public static void main(String[] args) {
        String[] arr = { "banana", "apple", "orange", "grapes", "mango" };
        sort(arr, 0, arr.length - 1);

        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    public static void sort(String[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(String[] arr, int low, int mid, int high) {
        String[] temp = new String[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = low; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}
