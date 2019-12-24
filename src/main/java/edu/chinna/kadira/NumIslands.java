package edu.chinna.kadira;

import static java.util.Objects.isNull;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * Input:
 * 11110
 * 11010
 * 11000
 * 00000
 * <p>
 * Output: 1
 */
public class NumIslands {
    final int[][] DIMENTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        System.out.println( new NumIslands().numIslands( new char[][]{{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}} ) );
    }

    private void dfs(char[][] grid, int i, int j, int r, int c) {
        if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] != '1') return;
        grid[i][j] = '0';
        for (int a[] : DIMENTIONS) {
            dfs( grid, i + a[0], j + a[1], r, c );
        }
    }

    public int numIslands(char[][] grid) {
        if (isNull( grid ) || grid.length==0 ) return 0;
        int result = 0;
        int r = grid.length, c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    dfs( grid, i, j, r, c );
                    result++;
                }
            }
        }
        return result;
    }
}
