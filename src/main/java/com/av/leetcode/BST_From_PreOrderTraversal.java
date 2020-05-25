package com.av.leetcode;

import com.av.utilities.TreePrinter.PrintableNode;
import java.util.Stack;

/**
 * May 24 2020 Coding Challenge from Leetcode https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/537/week-4-may-22nd-may-28th/3339/
 *
 * Return the root node of a binary search tree that matches the given preorder traversal.
 *
 * (Recall that a binary search tree is a binary tree where for every node, any descendant of
 * node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also
 * recall that a preorder traversal displays the value of the node first, then traverses node.left,
 * then traverses node.right.)
 *
 * EX:// Input [8,5,1,7,10,12] should output a BST [8,5,10,1,7,null,12]
 */
public class BST_From_PreOrderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder.length == 0) {
            return null;
        }
        TreeNode root = null;
        for (int val : preorder) {
            root = insertNode(root, val);
        }
        return root;
    }

    /**
     * Helper method that inserts node into the binary tree, first trying to insert at root, then
     * left is less than, then right since that is preorder traversal
     *
     * @return tree node that should be the new parent
     */
    private TreeNode insertNode(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        } else if (value < root.val) {
            root.left = insertNode(root.left, value);
        } else if (value > root.val) {
            root.right = insertNode(root.right, value);
        }
        return root;
    }


    public class TreeNode implements PrintableNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public PrintableNode getLeft() {
            return left;
        }

        @Override
        public PrintableNode getRight() {
            return right;
        }

        @Override
        public String getText() {
            return String.valueOf(val);
        }
    }


}
