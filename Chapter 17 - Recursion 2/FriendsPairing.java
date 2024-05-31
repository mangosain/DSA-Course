public class FriendsPairing {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsPairing(n));
    }

    public static int friendsPairing(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }

        int single = friendsPairing(n - 1);
        int paired = friendsPairing(n - 2);

        return single + (n - 1) * paired;
    }
}