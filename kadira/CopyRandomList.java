package edu.chinna.kadira;

import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * A linked list is given such that each node contains an additional random pointer which could point to any node
 * in the list or null.
 * <p>
 * Return a deep copy of the list.
 */
public class CopyRandomList {
//    public static void main(String[] args) {
//        Node next = null;
//        next = new Node( 2, null, next );
//        Node node = new Node( 1, next, next );
//
//        System.out.println( new CopyRandomList().copyRandomList( node ) );
//    }
//
//    private Node copyRandomList(Node head) {
//        if (isNull( head )) return null;
//        //create a map to hold the nodes
//        Map<Node, Node> nodeMap = new HashMap<>();
//
//        // loop 1. copy all the nodes
//        Node node = head;
//        while (nonNull( node )) {
//            nodeMap.put( node, new Node( node.val ) );
//            node = node.next;
//        }
//        // loop 2. assign next and random pointers
//        node = head;
//        while (nonNull( node )) {
//            nodeMap.get( node ).next = nodeMap.get( node.next );
//            nodeMap.get( node ).random = nodeMap.get( node.random );
//            node = node.next;
//        }
//        return nodeMap.get( head );
//    }


}

//class Node {
//    public int val;
//    public Node next;
//    public Node random;
//
//    public Node() {
//    }
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, Node _next, Node _random) {
//        val = _val;
//        next = _next;
//        random = _random;
//    }
//
//    public String toString() {
//        return "[ val : " + val + "  next " + next + "  random " + random+" ]";
//    }
//}