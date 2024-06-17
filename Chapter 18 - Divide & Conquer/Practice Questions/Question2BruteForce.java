public class Question2BruteForce {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int majority = arr.length / 2;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > majority) {
                return arr[i];
            }
        }

        return -1;
    }
}