// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2020
 */

 class SortComparison {

	    /**
	     * Sorts an array of doubles using InsertionSort.
	     * This method is static, thus it can be called as SortComparison.sort(a)
	     * @param a: An unsorted array of doubles.
	     * @return array sorted in ascending order.
	     *
	     */
	    static double [] insertionSort (double a[]){
	        //TODO: implement the sort
	    	double temp;
	    	for (int i = 1; i < a.length; i++){ 
	    		for(int j = i ; j > 0 ; j--){
	    			if(a[j] < a[j-1]){
	    				temp = a[j];
	    				a[j] = a[j-1];
	    				a[j-1] = temp;
	    				}
	    			}
	    		}
	    	return a;
	    }//end insertionSort
	
	    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){
    	
            int n = a.length; 
      
            // One by one move boundary of unsorted sub array 
            for (int i = 0; i < n-1; i++) 
            { 
                // Find the minimum element in unsorted array 
                int min_idx = i; 
                for (int j = i+1; j < n; j++) 
                    if (a[j] < a[min_idx]) 
                        min_idx = j; 
      
                // Swap the found minimum element with the first 
                // element 
                double temp = a[min_idx]; 
                a[min_idx] = a[i]; 
                a[i] = temp; 
            }
			return a; 
        
    }//end selectionSort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double[] a){
    	SortComparison.RecursiveQuickSort(a, 0, a.length-1);
    	return a;
    }
    


	/* The main function that implements QuickSort() 
    arr[] --> Array to be sorted, 
    low  --> Starting index, 
    high  --> Ending index */
    static public void RecursiveQuickSort(double[] a, int lo, int hi) {

    }


    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortIterative (double a[]) {

        } 
    

	/**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {

   }//end mergeSortRecursive
    	

    public static void main(String[] args) {

        //TODO: do experiments as per assignment instructions
    }

 }//end class

