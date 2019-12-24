package edu.chinna.kadira;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.lang.System.out;
import static java.util.Arrays.asList;

/***
 * Given n ropes of different lengths, we need to connect these ropes into one rope.
 * We can connect only 2 ropes at a time.
 * The cost required to connect 2 ropes is equal to sum of their lengths.
 * The length of this connected rope is also equal to the sum of their lengths.
 * This process is repeated until n ropes are connected into a single rope.
 * Find the min possible cost required to connect all ropes.
 */
public class MinimumCostToConnectSticks {
    public static void main(String[] args) {
        out.println( new MinimumCostToConnectSticks().minimumCostToConnectSticks( asList( 8, 4, 6, 12 ) ) );
        out.println( new MinimumCostToConnectSticks().minimumCostToConnectSticks( asList( 20, 4, 8, 2 ) ) );
        out.println( new MinimumCostToConnectSticks().minimumCostToConnectSticks( asList( 1, 2, 5, 10, 35, 89 ) ) );
        out.println( new MinimumCostToConnectSticks().minimumCostToConnectSticks( asList( 2, 2, 3, 3 ) ) );
    }

    private int minimumCostToConnectSticks(List<Integer> list) {

        Queue<Integer> pq = new PriorityQueue<>( list );
        int totalCost = 0;
        while (pq.size() > 1) {
            int cost = pq.poll() + pq.poll();
            pq.offer( cost );
            totalCost += cost;
        }
        return totalCost;
    }
}
