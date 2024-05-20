public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        int search = 10, row = 0, col = arr[0].length - 1;
        boolean found = false;

        while (row < arr.length && col > 0) {
            if (search == arr[row][col]) {
                found = true;
                System.out.println("found at [" + row + ", " + col + "]" );
                break;
            } else if (search < arr[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
