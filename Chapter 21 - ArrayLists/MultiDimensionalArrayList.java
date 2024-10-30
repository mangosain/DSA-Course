import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 5; i++) {
            list.add(new ArrayList<Integer>());
        }
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(1).add(3);
        list.get(1).add(4);
        list.get(1).add(5);
        list.get(2).add(6);
        list.get(3).add(7);
        list.get(3).add(8);
        list.get(4).add(9);
        list.get(4).add(10);
        list.get(4).add(11);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}
