package edu.chinna.kadira;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class TreasureIsland {
    int[][] DIMINSTIONS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) {
        char[][] a = {
                {'O', 'O', 'O', 'O'},
                {'O', 'D', 'O', 'O'},
                {'D', 'D', 'O', 'O'},
                {'X', 'O', 'O', 'D'}};
        System.out.println( new TreasureIsland().treasureIsland( a ) );

//        stream( new TreasureIsland().treasureIsland( a ) )
//                .filter( Objects::nonNull )
//                .forEach( System.out::println );
    }

    private boolean isSafe(char[][] grid, int i, int j, int r, int c) {
        return i >= 0 && i < r && j >= 0 && j < c && grid[i][j] != 'D';
    }

    public int treasureIsland(char[][] grid) {
        Map<Point, Integer> aMap = new HashMap<>();
        Queue<Point> q = new ArrayDeque<>(); //hoding the point
        Point point = new Point( 0, 0 );
        q.offer( point );
        grid[0][0] = 'D'; // mark as visited
        aMap.put( point, 1 );
        while (!q.isEmpty()) {
            Point p = q.poll();
            for (int[] dir : DIMINSTIONS) {
                int r = p.r + dir[0];
                int c = p.c + dir[1];
                if (isSafe( grid, r, c, grid.length, grid[0].length )) {
                    if (grid[r][c] == 'X') return aMap.get( p );
                    grid[r][c] = 'D';// mark as visited
                    point = new Point( r, c );
                    q.offer( point );
                    aMap.put( point, aMap.getOrDefault( p, 1 )+1 );
                }
            }
        }
        return -1;
    }
}
