public class LastOccurance {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4 };
        System.out.println(lastOccurance(arr, 4, 0));
    }

    public static int lastOccurance(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
}