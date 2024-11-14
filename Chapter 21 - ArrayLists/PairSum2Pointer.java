import java.util.ArrayList;

public class PairSum2Pointer {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            if (list.get(left) + list.get(right) == 5) {
                System.out.println("Pair found: [" + list.get(left) + ", " + list.get(right) + "]");
                left++;
                right--;
            } else if (list.get(left) + list.get(right) < 5) {
                left++;
            } else {
                right--;
            }
        }
    }
}
