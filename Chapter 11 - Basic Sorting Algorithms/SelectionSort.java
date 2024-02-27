public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
