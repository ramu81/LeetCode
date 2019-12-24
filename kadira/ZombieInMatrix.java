package edu.chinna.kadira;

public class ZombieInMatrix {
    //(up/down/left/right)
    int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        int[][] matrix = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        System.out.println( new ZombieInMatrix().zombieInMatrix( matrix ) );
    }

    /**
     * Zombie can turn adjacent (up/down/left/right) human beings into a zombie
     */
    private void zombieProcess(int[][] grid, int i, int j, int r, int c, int counter) {
        for (int[] a : DIRECTIONS) {
            int newX = i + a[0];
            int newY = j + a[1];
            if (newX >= 0 && newY >= 0 && newX < r && newY < c && grid[newX][newY] == 0) grid[newX][newY] = counter + 2;
        }
    }

    public int zombieInMatrix(int[][] matrix) {
        boolean isHumanFound = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    isHumanFound = true;
                    break;
                }
            }
        }
        // when no human found
        if (!isHumanFound)
            return 0;
        int counter = 0;
        while (true) {
            isHumanFound = false;
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print( matrix[i][j] + "\t" );
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == counter + 1)
                        zombieProcess( matrix, i, j, matrix.length, matrix[0].length, counter );
                    if (matrix[i][j] == 0) isHumanFound = true;
                }
            }
            System.out.println();
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print( matrix[i][j] + "\t" );
                }
                System.out.println();
            }
            counter++;
            // if found no human return the count
            if (!isHumanFound)
                return counter;

        }
    }
}
