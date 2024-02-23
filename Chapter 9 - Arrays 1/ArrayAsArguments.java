public class ArrayAsArguments {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        displayArray(arr);
        System.out.println();
        updateArray(arr);
        System.out.println();
        for (var each : arr) {
            System.out.print(each + " ");
        }
    }

    static void displayArray(int[] arr) {
        for (var each : arr) {
            System.out.print(each + " ");
        }
    }

    static void updateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10;
        }
        displayArray(arr);
    }
}
