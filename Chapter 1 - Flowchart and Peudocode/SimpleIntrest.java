import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the principal amount: ");
        int p = scanner.nextInt();

        System.out.print("Enter teh rate: ");
        int r = scanner.nextInt();

        System.out.print("Enter the time period: ");
        int t = scanner.nextInt();

        System.out.println("The Simple intrest is: " + (p * r *t)/100);

        scanner.close();
    }
}
