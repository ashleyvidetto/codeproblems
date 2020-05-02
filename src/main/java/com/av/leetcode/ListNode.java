package com.av.leetcode;

public class ListNode {

    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(val);
        if(next != null){
            buffer.append(", " + next.toString());
        }
        return buffer.toString();
    }
}

