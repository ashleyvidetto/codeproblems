package com.av.leetcode;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */

public class Add2Numbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode returnNode;
        if (l1 != null && l2 != null) {
            int value = l1.val + l2.val;
            if (value > 9) {
                returnNode = new ListNode(value - 10);
                if (l1.next != null) {
                    l1.next.val++;
                } else if (l2.next != null) {
                    l2.next.val++;
                } else {
                    returnNode.next = new ListNode(1);
                    return returnNode;
                }
            } else {
                returnNode = new ListNode(value);
            }
            returnNode.next = addTwoNumbers(l1.next, l2.next);
            return returnNode;
        } else if (l1 != null) {
            return l1;
        } else {
            return l2;
        }
    }
}
