public class MethodOverloading {
    public static void main(String[] args) {
        add(10, 5, 5);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(float a, float b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}