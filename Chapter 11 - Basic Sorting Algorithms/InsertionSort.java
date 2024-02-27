public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };

        for (int i = 1; i < arr.length; i++) {
            int prev = i - 1, temp = arr[i];
            while (prev >= 0 && arr[prev] > temp) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }

        for (var i : arr) {
            System.out.print(i + " ");
        }
    }
}
