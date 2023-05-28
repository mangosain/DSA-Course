import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int choice;

        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Find remainder");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The sum is: " + (a + b));
                    break;

                case 2:
                    System.out.println("a - b is: " + (a - b));
                    System.out.println("b - a is: " + (b - a));
                    break;

                case 3:
                    System.out.println("The product is: " + (a * b));
                    break;
                    
                case 4:
                    System.out.println("a / b is: " + (a / b));    
                    System.out.println("b / a is: " + (b / a));
                    break;
                    
                case 5:
                    System.out.println("The remainder for a % b is: " + (a % b));    
                    System.out.println("The remainder for b % a is: " + (b % a));    
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;
                    
                default:
                    System.out.println("Invalid input!!!");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
