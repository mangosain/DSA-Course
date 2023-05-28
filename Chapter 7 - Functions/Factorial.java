public class Factorial {
   public static void main(String[] args) {
        int n = 5;
        System.out.println("factorial of " + n + " is: " + factorial(n));
   } 

   public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
   }
}
