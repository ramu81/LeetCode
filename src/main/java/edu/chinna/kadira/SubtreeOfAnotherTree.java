package edu.chinna.kadira;

import static java.util.Objects.isNull;

/**
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values
 * with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants.
 * The tree s could also be considered as a subtree of itself.
 */
public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode three = new TreeNode( 3 );
        TreeNode four = new TreeNode( 3 );
        TreeNode five = new TreeNode( 3 );
        TreeNode two = new TreeNode( 3 );
        TreeNode one = new TreeNode( 3 );
        three.left = four;
        three.right = five;
        four.left = one;
        four.right = two;
        TreeNode six = new TreeNode( 6 );
        System.out.println( new SubtreeOfAnotherTree().isSubtreeOfAnotherTree( three, four ) );
    }

    boolean isSubtreeOfAnotherTree(TreeNode tree, TreeNode subTree) {
        // when sub tree is nulll
        if (isNull( subTree )) return false;

        if (isSameTree( subTree, tree )) return true;

        return isSubtreeOfAnotherTree( subTree.left, tree ) || isSubtreeOfAnotherTree( subTree.right, tree );
    }

    boolean isSameTree(TreeNode subTree, TreeNode tree) {
        // both should be null
        if (isNull( tree ) && isNull( subTree )) return true;
        // either of one is null and values are diff
        if (isNull( tree ) || isNull( subTree ) || tree.val != subTree.val) return false;

        return isSameTree( subTree.right, tree.right ) && isSameTree( subTree.left, tree.left );
    }
}
