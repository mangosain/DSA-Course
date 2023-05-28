import java.util.Scanner;

public class GreaterOf2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        System.out.print("Enter another number: ");
        int b = scanner.nextInt();

        if(a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b +" is greater");
        }

        scanner.close();
    }
}
