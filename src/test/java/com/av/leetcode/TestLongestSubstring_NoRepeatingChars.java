package com.av.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class TestLongestSubstring_NoRepeatingChars extends TestCase {

    /**
     * Object under test
     */
    private static LongestSubstring_NoRepeatingChars longestSS_noRepeat = new LongestSubstring_NoRepeatingChars();

    /**
     * Test cases from question:
     * Example 1:
     *
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     *
     * Input: "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     *
     * Input: "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */
    @Test
    public void testLengthOfLongestSubstring() {
        String input = "abcabcbb";
        assertEquals(3, longestSS_noRepeat.lengthOfLongestSubstring(input));

        input = "bbbbb";
        assertEquals(1, longestSS_noRepeat.lengthOfLongestSubstring(input));

        input = "pwwkew";
        assertEquals(3, longestSS_noRepeat.lengthOfLongestSubstring(input));

        input = "aab";
        assertEquals(2, longestSS_noRepeat.lengthOfLongestSubstring(input));

        input = "dvdf";
        assertEquals(3, longestSS_noRepeat.lengthOfLongestSubstring(input));

        input = "tmmzuxt";
        assertEquals(5, longestSS_noRepeat.lengthOfLongestSubstring(input));

        input = "bbtablud";
        assertEquals(6, longestSS_noRepeat.lengthOfLongestSubstring(input));
    }
}