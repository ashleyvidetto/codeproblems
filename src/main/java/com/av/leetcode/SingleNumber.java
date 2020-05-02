package com.av.leetcode;

import java.util.HashSet;

public class SingleNumber {

    public static int getSingleNumber(int[] input){
        HashSet<Integer> numbers = new HashSet<>();
        for (int i : input) {
            if (numbers.contains(i)) {
                numbers.remove(i);
            }
            else{
                numbers.add(i);
            }
        }
        return (int) numbers.toArray()[0];
    }

}
