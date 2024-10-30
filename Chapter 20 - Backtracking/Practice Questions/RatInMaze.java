public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 0 },
                { 1, 1, 1, 1 },
        };

        solveMaze(maze);
    }

    public static void solveMaze(int[][] maze) {
        int[][] sol = new int[maze.length][maze[0].length];

        if (!solveMazeHelper(maze, 0, 0, sol)) {
            System.out.println("No Solution!!!");
            return;
        }

        System.out.println("Solved Successfully!!!");
        printSolution(sol);
    }

    public static boolean solveMazeHelper(int[][] maze, int row, int col, int[][] sol) {
        if (row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] == 1) {
            sol[row][col] = 1;
            return true;
        }

        if (isSafe(maze, row, col)) {
            sol[row][col] = 1;
            if (solveMazeHelper(maze, row + 1, col, sol)) {
                return true;
            }
            if (solveMazeHelper(maze, row, col + 1, sol)) {
                return true;
            }
            sol[row][col] = 1;
        }

        return false;
    }

    public static boolean isSafe(int[][] maze, int row, int col) {
        return row < maze.length && row >= 0 && col >= 0 && col < maze[0].length && maze[row][col] == 1;
    }

    public static void printSolution(int[][] solution) {
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }
}
