package com.av.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Leetcode Medium Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string, find the length of the longest substring without repeating characters.
 */


public class LongestSubstring_NoRepeatingChars {

    public int lengthOfLongestSubstring(String s) {
        //first start with brute force method - go until you repeat, always start at one
        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int max = 0;
        int currentCount = 0;
        int startIndex = 0;
        //we store the character in this set and the index it was seen at. This way we can tell what int we should be in the sequence
        HashMap<Character, Integer> charSeen = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charSeen.containsKey(s.charAt(i))) {
                //current count needs to subtract from index value
                if (charSeen.get(s.charAt(i)) >= startIndex) {
                    if (currentCount > max) {
                        max = currentCount;
                    }
                    int indexDiff = (charSeen.get(s.charAt(i)) + 1) - startIndex;
                    startIndex = charSeen.get(s.charAt(i)) + 1;
                    currentCount -= indexDiff;
                }
            }
            currentCount++;
            charSeen.put(s.charAt(i), i);

        }
        if (currentCount > max) {
            max = currentCount;
        }
        return max;
    }
}
