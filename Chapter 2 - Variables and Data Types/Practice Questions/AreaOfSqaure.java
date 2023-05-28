import java.util.Scanner;

public class AreaOfSqaure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side: ");
        float side = scanner.nextFloat();

        System.out.println("The area of the square is: " + (side * side));

        scanner.close();
    }
}
