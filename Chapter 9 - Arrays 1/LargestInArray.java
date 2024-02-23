public class LargestInArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}
