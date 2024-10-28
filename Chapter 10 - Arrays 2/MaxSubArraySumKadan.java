public class MaxSubArraySumKadan {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.println(maxSum);
    }
}
