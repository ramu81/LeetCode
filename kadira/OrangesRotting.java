package edu.chinna.kadira;

import static java.lang.System.out;

public class OrangesRotting {
    final int[][] DIRECTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        out.println( new OrangesRotting().orangesRotting( new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}} ) );
    }

    private void anOrangeRotting(int[][] grid, int i, int j, int r, int c, int min) {
        for (int[] a : DIRECTIONS) {
            int newX = i + a[0];
            int newY = j + a[1];
            if (newX >= 0 && newY >= 0 && newX < r && newY < c && grid[newX][newY] == 1) grid[newX][newY] = min + 3;
        }
    }

    private int orangesRotting(int[][] grid) {
        int min = 0;
        int r = grid.length;
        int c = grid[0].length;
        while (true) {
            boolean isRootFound = false;
            boolean isFresh = false;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (grid[i][j] == min + 2) {
                        isRootFound = true;
                        grid[i][j] = 0;
                        anOrangeRotting( grid, i, j, r, c, min );
                    }
                    if (grid[i][j] == 1) {
                        isFresh = true;
                    }
                }
            }

            if (!isRootFound) {
                if (isFresh)
                    return -1;
                break;
            }
            min++;
        }
        return min == 0 ? min : min - 1;
    }
}
