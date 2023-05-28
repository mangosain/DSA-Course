public class IncomeTaxCalculator {
    public static void main(String[] args) {
        int income = 670000;

        if (income < 500000) {
            System.out.println("The income tax is: 0" );
        } else if (income > 500000 && income < 1000000) {
            System.out.println("The tax is: " + (0.2 * income));
        } else {
            System.out.println("The tax is: " + (0.3 * income));
        }
    }
}
