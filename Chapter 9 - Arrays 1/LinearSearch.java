public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int target = 11;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The target is at index: " + index);
        } else {
            System.out.println("The target is not in the array");
        }
    }
}
