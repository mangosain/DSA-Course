public class UpadteIthBit {
    public static void main(String[] args) {
        int n = 10, i = 1, newBit = 0;

        if (newBit == 0) {
            n = n & ~(1 << i); // Clear ith bit
        } else {
            n = n | (1 << i); // Set ith bit
        }

        System.out.println(n);

        // OR

        int cleared = n & ~(1 << i); // Clear ith bit
        int result = cleared | (newBit << i); // Set ith bit
        System.out.println(result);
    }
}
