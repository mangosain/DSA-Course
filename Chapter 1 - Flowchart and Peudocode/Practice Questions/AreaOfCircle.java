import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int r = scanner.nextInt();

        System.out.println("The area of the circle is: " + (3.14 * r *r));

        scanner.close();
    }
}
