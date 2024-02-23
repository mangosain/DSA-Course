public class ArrayUpdate {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        arr[1] = 100;

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
