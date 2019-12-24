package edu.chinna.kadira;

import static java.util.Objects.isNull;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
// 1->2->4, 1->3->4
        ListNode xOne = new ListNode( 1 );
        ListNode two = new ListNode( 2 );
        ListNode four = new ListNode( 4 );
        xOne.next = two;
        two.next = four;
//        ListNode yOne = new ListNode( 1 );
        ListNode three = new ListNode( 3 );
//        four = new ListNode( 4 );
//        yOne.next = three;
//        three.next = four;
        new MergeTwoSortedLists().mergeTwoLists( xOne,three );
        System.out.println( xOne );
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (isNull( l1 )) return l2;
        if (isNull( l2 )) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists( l1.next, l2 );
            return l1;
        } else {
            l2.next = mergeTwoLists( l1, l2.next );
            return l2;
        }
    }
}
