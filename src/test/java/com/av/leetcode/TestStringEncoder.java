package com.av.leetcode;

import static org.junit.Assert.*;

import com.av.interview.wwt.StringEncoder;
import org.junit.Test;

public class TestStringEncoder {


    @Test
    public void testEncode(){
        String input1 = "Hello World!";
        String expectedAnswer = "g2kk4yv4qkc!";

        assertEquals(expectedAnswer, StringEncoder.encode(input1));


        String input2 = "FH12LL";
        expectedAnswer = "eg21kk";
        assertEquals(expectedAnswer, StringEncoder.encode(input2));



    }

}