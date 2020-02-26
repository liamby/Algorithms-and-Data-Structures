/*
 * 
						Insert 			Selection		 Merge		 Recursive Merge	 Iterative Quick 
10 random			|	6000.0   	|	5900.0   	|	9300.0   	|	12000.0		|	11800.0
100 random			|	187300.0	|	127900.0 	|	115100.0	|	99600.0		|	137000.0
1000 random			|	6211500.0	|	3756700.0	|	942300.0	|	1090399.0	|	4353600.0			
1000 few unique		|	8592799.0	|	3735601.0	|	974400.0	|	1063500.0	|	4934699.0			
1000 nearly ordered	|	7528401.0	|	3572201.0	|	1062600.0	|	1032800.0	|	5272200.0	
1000 reverse order	|	1.5276501E7	|	3139501.0	|	716900.0	|	714300.0	|	3676100.0					
1000 sorted			|	7882699.0	|	5860900.0	|	1090101.0	|	1100600.0	|	5014700.0		


a.  Which of the sorting algorithms does the order of input have an impact on? Why?
	
	Insertion sort because, all of the elements in the array will need to be moved by a position each time they are swapped.
	they will need to be swapped a maximum number of times to get into possition. 
	
b.  Which algorithm has the biggest difference between the best and worst performance,
 	based on the type of input, for the input of size 1000? Why?
	
	Insertion sort has the biggest difference between the best and worse case performance.
	The best case performance is Theta(n) if the array is already sorted.
	The worst case Performance is O(n^2) when the array is in reverse order.
	
c.  Which algorithm has the best/worst scalability, i.e.  , the difference in performance time based on the input size? 
	Please consider only input files with random order for this answer.
	best quickSort worst is selection sort. 
	
	QuickSort has the best scalability, Insertion sort and selection sort have the worst scalability. 
	
d.  Did you observe any difference between iterative and recursive implementations of mergesort?

	They are both extreemely similar, there dont seem to be any meaningful differences.
	
e.  Which algorithm is the fastest for each of the 7 input files?
	Mergesort recursive is the fastest once the datasets get large. 
	
*/


import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

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
    	double [] a = {1,2,4,3,5};
    	assertEquals( "Checking insertion sort on an regular array", a.toString(), SortComparison.insertionSort(a).toString());
    	assertEquals( "Checking selection sort on an regular array", a.toString(), SortComparison.selectionSort(a).toString());
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

