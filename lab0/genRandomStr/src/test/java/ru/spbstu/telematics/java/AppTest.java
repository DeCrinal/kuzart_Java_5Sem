package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testGenerateRandomChar() {
        char randomChar = App.generateRandomChar();
        assertTrue(Character.isLetter(randomChar));
    }

    public void testGenerateRandomString() {
        int symbsNum = 10;
        String randomString = App.generateRandomString(symbsNum);

        assertNotNull(randomString);
        assertEquals(symbsNum, randomString.length());
    }

    public void testGenerateRandomStringWithNegativeLength() {
        int symbsNum = -5;
        String randomString = App.generateRandomString(symbsNum);

        assertNotNull(randomString);
        assertEquals(0, randomString.length());
    }

    public void testGenerateRandomStringWithZeroLength() {
        int symbsNum = 0;
        String randomString = App.generateRandomString(symbsNum);

        assertNotNull(randomString);
        assertEquals(0, randomString.length());
    }
}
