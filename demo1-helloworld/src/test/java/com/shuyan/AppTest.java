package com.shuyan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void matchesTest(){
        boolean matches = "abcd123".matches("^(?=\\w*\\d)\\w*");
        System.out.println(matches);
    }
}
