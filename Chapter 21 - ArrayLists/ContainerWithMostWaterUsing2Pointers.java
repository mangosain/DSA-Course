import java.util.ArrayList;

public class ContainerWithMostWaterUsing2Pointers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int maxArea = 0;

        int lp = 0;
        int rp = list.size() - 1;

        while (lp < rp) {
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int currentArea = height * width;
            maxArea = Math.max(maxArea, currentArea);

            if (list.get(lp) < list.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        System.out.println(maxArea);
    }
}
