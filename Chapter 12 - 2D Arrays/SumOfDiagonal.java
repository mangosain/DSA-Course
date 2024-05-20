public class SumOfDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        int sum = 0;
        int sum2  = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j || i + j == 3) {
                    sum += arr[i][j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i][i];
            sum2 += arr[i][arr.length-1-i];
        }

        System.out.println(sum);
        System.out.println(sum2);
    }
}
