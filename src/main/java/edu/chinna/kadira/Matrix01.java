package edu.chinna.kadira;

import static java.lang.Math.min;

public class Matrix01 {
    int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        int[][] result = new Matrix01().updateMatrix( new int[][]{
                {0, 0, 0}, {0, 1, 0}, {1, 1, 1}
        } );
        for (int[] temp : result) {
            System.out.println( temp[0] + "  " + temp[1] + "   " + temp[2] );
        }
    }

    public int[][] updateMatrix(int[][] matrix) {
        int[][] mark = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) continue;
                matrix[i][j] = getDistance( matrix, mark, i, j );
            }
        }
        return matrix;
    }

    int getDistance(int[][] matrix, int[][] mark, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || mark[i][j] == 1) return -1;

        mark[i][j] = 1;
//        int[] result1 = new int[4];
//        int k = 0;
//        for (int[] temp : DIRECTIONS)
//            result1[k++] = 1 + getDistance( matrix, mark, i + temp[0], j + temp[1] );
//        mark[i][j] = 0;
//        return min( min( result1[0], result1[1] ), min( result1[2], result1[3] ) );
        int searchUp = 1 + getDistance( matrix, mark, i - 1, j );
        int searchLeft = 1 + getDistance( matrix, mark, i, j - 1 );
        int searchDown = 1 + getDistance( matrix, mark, i + 1, j );
        int searchRight = 1 + getDistance( matrix, mark, i, j + 1 );
        mark[i][j] = 0;
        return min( min( searchDown, searchLeft ), min( searchRight, searchUp ) );
    }
}
