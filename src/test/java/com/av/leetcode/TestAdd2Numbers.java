package com.av.leetcode;

import org.junit.Test;


public class TestAdd2Numbers {

    @Test
    public void testTwoNumbers() {
        ListNode input1 = createListNode(new int[]{1});
        System.out.println("Input 1  \t{"+input1+"}");
        ListNode input2 = createListNode(new int[]{9, 9});
        System.out.println("Input 2  \t{"+input2+"}");
        System.out.println("Answer: \t{" + Add2Numbers.addTwoNumbers(input1, input2).toString()+"}");
    }

    private ListNode createListNode(int[] ints) {
        ListNode firstNode = null;
        ListNode prevNode = null;
        ListNode currentNode = null;
        for (int i : ints) {
            currentNode = new ListNode(i);
            if (firstNode == null) {
                firstNode = currentNode;
            }
            if (prevNode != null) {
                prevNode.next = currentNode;
            }
            prevNode = currentNode;
        }
        return firstNode;
    }
}
