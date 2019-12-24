package edu.chinna.kadira;

import java.util.Objects;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * Algorithm of Insertion Sort:
 * <p>
 * Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
 * <p>
 * At each iteration, insertion sort removes one element from the input data, finds the location it belongs
 * within the sorted list, and inserts it there.
 * <p>
 * It repeats until no input elements remain.
 */
public class InsertionSortList {

    public static void main(String[] args) {
        ListNode node4 = new ListNode( 0 );
        ListNode node2 = new ListNode( 1 );
        ListNode node1 = new ListNode( 3 );
        ListNode node3 = new ListNode( 5 );
        node4.next = node2;
        node2.next = node1;
        node1.next = node3;
        System.out.println( node4 );
        ListNode newNode = new ListNode( 4 );
        System.out.println( new InsertionSortList().insertionSortList( node4, newNode ) );
    }

    public ListNode insertionSortList(ListNode head, ListNode newNode) {
        ListNode current = head;
        while (nonNull( current.next ) && current.next.val < newNode.val)
            current = current.next;
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
}
