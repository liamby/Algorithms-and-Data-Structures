import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty()
    {
    	double [] a = {};
    	assertEquals( "Checking insertion sort on an empty array", a.toString(), SortComparison.insertionSort(a).toString());
    	assertEquals( "Checking selection sort on an empty array", a.toString(), SortComparison.selectionSort(a).toString());
    	assertEquals( "Checking sort on an empty array", a.toString(), SortComparison.insertionSort(a).toString());
    	assertEquals( "Checking quick sort on an empty array", a.toString(), SortComparison.quickSort(a).toString());
    	assertEquals( "Checking merge sort iterative on an empty array", a.toString(), SortComparison.mergeSortIterative(a).toString());
    	assertEquals( "Checking merge sort recursive on an empty array", a.toString(), SortComparison.mergeSortRecursive(a).toString());
    }
    
    @Test
    public void testRegArray()
    {
    	double [] a = {1,2,3,4,5};
    	assertEquals( "Checking insertion sort on an regular array", a.toString(), SortComparison.insertionSort(a).toString());
    	assertEquals( "Checking selection sort on an regular array", a.toString(), SortComparison.selectionSort(a).toString());
    	assertEquals( "Checking sort on an regular array", a.toString(), SortComparison.insertionSort(a).toString());
    	assertEquals( "Checking quick sort on an regular array", a.toString(), SortComparison.quickSort(a).toString());
    	assertEquals( "Checking merge sort iterative on an regular array", a.toString(), SortComparison.mergeSortIterative(a).toString());
    	assertEquals( "Checking merge sort recursive on an regular array", a.toString(), SortComparison.mergeSortRecursive(a).toString());
    }

    // TODO: add more tests here. Each line of code and each decision in Collinear.java should
    // be executed at least once from at least one test.

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        
    }

}

