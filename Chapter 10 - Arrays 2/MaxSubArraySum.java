public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        int maxSum = Integer.MIN_VALUE, currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
