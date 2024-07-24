public class MajorityElementDnQ {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2, 1, 1 };
        System.out.println(majorityElement(arr, 0, arr.length - 1));
    }

    public static int majorityElement(int[] arr, int low, int high) {
        if (low >= high) {
            return arr[low];
        }

        int mid = low + (high - low) / 2;
        int left = majorityElement(arr, low, mid);
        int right = majorityElement(arr, mid + 1, high);

        if (left == right) {
            return left;
        }

        int leftCount = count(arr, low, mid, left);
        int rightCount = count(arr, mid + 1, high, right);

        return leftCount > rightCount ? left : right;
    }

    public static int count(int[] arr, int low, int high, int num) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }
}