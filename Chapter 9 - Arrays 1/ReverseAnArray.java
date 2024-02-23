public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13, 15 };

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        int n = arr.length - 1, j = 0, temp;

        while (n > j) {
            temp = arr[j];
            arr[j] = arr[n];
            arr[n] = temp;
            n--;
            j++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
