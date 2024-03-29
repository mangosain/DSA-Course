import java.util.Scanner;

public class Creation2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 },
        };

        System.out.println("Matrix 1:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arr2 = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements:");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix 2:");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
