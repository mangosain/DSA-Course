public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j -= 1;
            }

            arr[j + 1] = temp;
        }

        for (var i : arr) {
            System.out.print(i + " ");
        }
    }
}
