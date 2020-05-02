package com.av.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSingleNumber {

    @Test
   public void testSingleNumber(){
       int[] input1 = new int[]{0, 2, 2, 0, 4};
       assertEquals(4, SingleNumber.getSingleNumber(input1));
   }
    
}