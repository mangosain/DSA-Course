public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char ch = path.charAt(i);
            if (ch == 'N') {
                y++;
            } else if (ch == 'S') {
                y--;
            } else if (ch == 'E') {
                x++;
            } else if (ch == 'W') {
                x--;
            }
        }

        System.out.println("Shortest Path: " + Math.sqrt((x * x) + (y * y)));
    }
}
