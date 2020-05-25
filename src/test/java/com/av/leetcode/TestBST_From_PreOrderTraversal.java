package com.av.leetcode;

import com.av.leetcode.BST_From_PreOrderTraversal.TreeNode;
import com.av.utilities.TreePrinter;
import junit.framework.TestCase;
import org.junit.Test;

public class TestBST_From_PreOrderTraversal extends TestCase {

    /*
    Object under test
     */
    private static BST_From_PreOrderTraversal bst = new BST_From_PreOrderTraversal();

    @Test
    public void testBstFromPreorder(){
        int[] secondTest = {19,4,8,11};
        TreeNode returnedNode = bst.bstFromPreorder(secondTest);
        TreePrinter.print(returnedNode);

        int[] firstTest = {8, 5, 1, 7, 10, 12};
        returnedNode = bst.bstFromPreorder(firstTest);

    }



}