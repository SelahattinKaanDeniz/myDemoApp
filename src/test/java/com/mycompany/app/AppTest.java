package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;



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
    
    public void testTrue() {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 1));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 4, 4, 4, 3));
        assertTrue(new App().countOccur(array1,array2,1,4));
      }
      
      
      public void testFalse() {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        
        assertFalse(new App().countOccur(array1,array2,1,3));
      }
      
      public void testEmptyArray() {
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        assertFalse(new App().countOccur(array1,array2,3,1));
      }
     
      public void testNull() {
        assertFalse(new App().countOccur(null,null,1,3));
      }
      
      public void testWrongIntParameter() {
          ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1));
          ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
          
          assertFalse(new App().countOccur(array1,array2,5,7));
        }

}
