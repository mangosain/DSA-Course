public class MaxSubArraySumUsingPrefixArray {
    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);
    }
}
