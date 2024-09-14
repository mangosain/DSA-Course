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
        int[][] solution = new int[maze.length][maze[0].length];

        if (!solveMazeHelper(maze, 0, 0, solution)) {
            System.out.println("No solution");
            return;
        }

        printSolution(solution);
        return;
    }

    public static boolean solveMazeHelper(int[][] maze, int row, int col, int[][] solution) {
        if (row == maze.length - 1 && col == maze[0].length - 1 && maze[row][col] == 1) {
            solution[row][col] = 1;
            return true;
        }

        if (isSafe(maze, row, col)) {
            solution[row][col] = 1;
            if (solveMazeHelper(maze, row, col + 1, solution)) {
                return true;
            }
            if (solveMazeHelper(maze, row + 1, col, solution)) {
                return true;
            }
            solution[row][col] = 0;
        }

        return false;
    }

    public static boolean isSafe(int[][] maze, int row, int col) {
        return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] == 1;
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
