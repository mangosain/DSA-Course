public class CreateAnArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] arr2 = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        int arr3[] = new int[] { 10, 20, 30, 40, 50 };
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}