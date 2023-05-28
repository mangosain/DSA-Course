public class AvgOfThreeNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 25;

        System.out.println("the average of is: " + avg(a, b, c));
    }

    public static double avg(int a, int b, int c) {
        return (double)(a + b + c)/3;
    }
}
