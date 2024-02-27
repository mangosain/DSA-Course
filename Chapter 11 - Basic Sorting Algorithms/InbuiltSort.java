import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };

        Arrays.sort(arr, 0, 3);

        for (var i : arr) {
            System.err.print(i + " ");
        }

        System.out.println();

        Arrays.sort(arr);

        for (var i : arr) {
            System.err.print(i + " ");
        }

        System.out.println();

        Integer[] arr2 = { 5, 4, 1, 3, 2 };

        Arrays.sort(arr2, Collections.reverseOrder());

        for (var i : arr2) {
            System.err.print(i + " ");
        }
    }
}