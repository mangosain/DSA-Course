import java.util.ArrayList;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int index1 = 1;
        int index2 = 3;

        System.out.print("Before swapping: " + list);

        swap(list, index1, index2);

        System.out.println("\nAfter swapping: " + list);
    }

    public static void swap(ArrayList<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}