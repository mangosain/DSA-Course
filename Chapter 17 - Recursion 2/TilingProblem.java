class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tiling(3));
    }

    public static int tiling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // for vertical tiling
        int verticalTiling = tiling(n - 1);

        // for horizontal tiling
        int horizontalTiling = tiling(n - 2);

        // total ways
        return verticalTiling + horizontalTiling;
    }
}