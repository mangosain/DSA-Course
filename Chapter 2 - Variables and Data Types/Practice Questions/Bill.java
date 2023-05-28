import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the cost of the pencil: ");
            float pencil = scanner.nextFloat();

            System.out.print("Enter the cost of the pen: ");
            float pen = scanner.nextFloat();

            System.out.print("Enter the cost of the erasaer: ");
            float eraser = scanner.nextFloat();

            float total = pencil + pen + eraser;
            float gst = (total * 0.18f);

            System.out.println("\t-----Bill-----");
            System.out.println("Item\t\tCost");
            System.out.println("\t--------------");
            System.out.println("Pencil\t\t" + pencil);
            System.out.println("Pen\t\t" + pen);
            System.out.println("Eraser\t\t" + eraser);
            System.out.println("Gst\t\t" + gst);
            System.out.println("total\t\t" + (total + gst));

            scanner.close();
    }
}
