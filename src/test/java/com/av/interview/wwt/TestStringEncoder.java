package com.av.interview.wwt;

import org.junit.Assert;
import org.junit.Test;

public class TestStringEncoder {


    @Test
    public void testEncode(){
        String input1 = "Hello World!";
        String expectedAnswer = "g2kk4yv4qkc!";

        Assert.assertEquals(expectedAnswer, StringEncoder.encode(input1));


        String input2 = "FH12LL";
        expectedAnswer = "eg21kk";
        Assert.assertEquals(expectedAnswer, StringEncoder.encode(input2));



    }

}