import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[8];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("The array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sumEven = 0, sumOdd = 0;
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEven += array[i];
                evenList.add(array[i]);
            } else {
                sumOdd += array[i];
                oddList.add(array[i]);
            }
        }

        System.out.println("The sum of even numbers is: " + sumEven);
        System.out.println("Even numbers are: " + evenList);
        System.out.println("The sum of odd numbers is: " + sumOdd);
        System.out.println("The odd numbers are: " + oddList);

        scanner.close();
    }
}
