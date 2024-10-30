import java.util.ArrayList;

public class DefineArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        System.out.println(list.get(2));

        list.remove(1);
        System.out.println(list);

        list.set(2, 100);
        System.out.println(list);

        System.out.println(list.contains(100));
        System.out.println(list.contains(200));

        System.out.println(list.size());
    }
}