package edu.chinna.kadira;

import static java.lang.System.out;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 */
public class NumberofIslands {

    int[][] DIM = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {
        char[][] matrix = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        out.println( new NumberofIslands().numberofIslands( matrix ) );
    }

    int numberofIslands(char[][] matrix) {
        int result = 0;
        int row = matrix.length, column = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == '1') {
                    dfs( matrix, row, column, i, j );
                    result++;
                }
            }
        }
        return result;
    }

    void dfs(char[][] matrix, int row, int column, int i, int j) {
        //look for the element which marked as a visited
        if (i < 0 || j < 0 || i >= row || j >= column || matrix[i][j] == '0') return;
        else matrix[i][j] = '0'; // mark visit
        // look for the adjacent & harizantal elements
        for (int[] k : DIM)
            dfs( matrix, row, column, i + k[0], j + k[1] );
    }
}
