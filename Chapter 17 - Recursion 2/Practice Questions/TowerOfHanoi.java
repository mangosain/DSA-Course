public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'C', 'B');
    }

    public static void towerOfHanoi(int n, char src, char dest, char aux) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from rod " + src + " to rod " + dest);
            return;
        }

        towerOfHanoi(n - 1, src, aux, dest);
        System.out.println("Move disk " + n + " from rod " + src + " to rod " + dest);
        towerOfHanoi(n - 1, aux, dest, src);
    }
}
