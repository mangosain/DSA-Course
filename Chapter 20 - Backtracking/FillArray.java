public class FillArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        fillArray(arr, 0, 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void fillArray(int[] arr, int i, int val) {
        if (i == arr.length) {
            return;
        }

        arr[i] = val;
        fillArray(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }
}
