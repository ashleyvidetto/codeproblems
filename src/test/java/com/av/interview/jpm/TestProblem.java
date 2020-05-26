package com.av.interview.jpm;

import junit.framework.TestCase;
import org.junit.Test;

public class TestProblem extends TestCase {


    @Test
    public void testProblem(){

       String input = "2N# 9k";
       assertEquals("invalid", Problem.solution(input));


    }

}