package edu.chinna.kadira;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

/**
 * You are given an undirected connected graph.
 * An articulation point (or cut vertex) is defined as a vertex which,
 * when removed along with associated edges, makes the graph disconnected (or more precisely,
 * increases the number of connected components in the graph).
 * The task is to find all articulation points in the given graph.
 * <p>
 * Input:
 * The input to the function/method consists of three arguments:
 * <p>
 * numNodes, an integer representing the number of nodes in the graph.
 * numEdges, an integer representing the number of edges in the graph.
 * edges, the list of pair of integers - A, B representing an edge between the nodes A and B.
 * Output:
 * Return a list of integers representing the critical nodes.
 */

/***
 * Tarjan's strongly connected components algorithm
 *
 */

public class CriticalRouters {
    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 5}, {5, 6}, {3, 4}};
        stream( new CriticalRouters().criticalRouters( 7, 7, edges ) )
                .forEach( System.out::println );
    }

    /***
     *
     The algorithm takes a directed graph as input, and produces a partition of the graph's vertices
     into the graph's strongly connected components. Each vertex of the graph appears in exactly one of
     the strongly connected components. Any vertex that is not on a directed cycle forms a strongly
     connected component all by itself: for example, a vertex whose in-degree or out-degree is 0,
     or any vertex of an acyclic graph.

     The basic idea of the algorithm is this: a depth-first search begins from an arbitrary start node.
     (and subsequent depth-first searches are conducted on any nodes that have not yet been found)
     As usual with depth-first search, the search visits every node of the graph exactly once,
     declining to revisit any node that has already been visited.
     hus, the collection of search trees is a spanning forest of the graph.
     */
    private int[] criticalRouters(int numNodes, int numEdges, int[][] edges) {
        List<Integer> list = new ArrayList<>();

        return list.stream().mapToInt( i -> i ).toArray();
    }
}
