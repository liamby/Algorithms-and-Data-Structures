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
		 
		//check array is not null
	    if (a ==null) {
	 		return a;
	 	}
	    	 
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
    	
    	//check array is not null
    	if (a ==null) {
 	    	return a;
 	    }
    	 
    	int n = a.length; 
      
    	// One by one move boundary of unsorted sub array 
        for (int i = 0; i < n-1; i++) 
        { 
        	// Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j] < a[min_idx]) { 
                    min_idx = j; 
                }
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
    	
    	//check array is not null
    	if (a ==null) {
 	    	return a;
 	    }
    	 
    	SortComparison.RecursiveQuickSort(a, 0, a.length-1);
    	return a;
    }
    


	/* The main function that implements QuickSort() 
    arr[] --> Array to be sorted, 
    low  --> Starting index, 
    high  --> Ending index */
    static public void RecursiveQuickSort(double[] a, int lo, int hi) {
    	
    	if(hi <= lo) {
    		return; 
    	} 
    	
    	/*pivotPos is now in the right place*/
    	int pivotPos = partition(a, lo, hi);
    	
    	/* Recursively sort elements before 
        partition and after partition*/ 
    	RecursiveQuickSort(a, lo, pivotPos-1);
    	RecursiveQuickSort(a, pivotPos+1, hi);
    }
   
    
//takes in an array 
//chooses a pivot 
//pushes it to the end 
//	gets IFL and IFR larger than pivot ... smaller than pivot 
//	switch 
//do while IFL index < IFR index
//swap IFL with pivot 
    private static int partition(double[] a, int lo, int hi) {
		 
    	int pivotPos = a.length-1;
    	int i = -1;
    	for (int j = 0; j<a.length-1; j++) {
    		if (a[j] < a[pivotPos]) {
    			i++;
    			double tmp = a[j];
    			a[j] = a[i];
    			a[i] = tmp;
    		}
    	}
		return pivotPos;
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
    	
        if(a == null) 
        { 
            //Println("ERROR: array is null "); 
        } 
      
        if(a.length > 1) 
        { 
            int mid = a.length / 2; 
      
            // Split left part 
            double[] left = new double[mid]; 
            for(int i = 0; i < mid; i++) 
            { 
                left[i] = a[i]; 
            } 
                  
            // Split right part 
            double[] right = new double[a.length - mid]; 
            for(int i = mid; i < a.length; i++) 
            { 
                right[i - mid] = a[i]; 
            } 
            mergeSortIterative(left); 
            mergeSortIterative(right); 
      
            int i = 0; 
            int j = 0; 
            int k = 0; 
      
            // Merge left and right arrays 
            while(i < left.length && j < right.length) 
            { 
                if(left[i] < right[j]) 
                { 
                    a[k] = left[i]; 
                    i++; 
                } 
                else
                { 
                    a[k] = right[j]; 
                        j++; 
                } 
                k++; 
            } 
                
            // Collect remaining elements 
            while(i < left.length) 
            { 
                a[k] = left[i]; 
                i++; 
                k++; 
            } 
            while(j < right.length) 
            { 
                a[k] = right[j]; 
                j++; 
                k++; 
            } 
        }
        return a; 
    } 
    

	/**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {
    	
    	//check array is not null
    	if (a ==null) {
 	    	return a;
 	    }
    	 
    	sortAndMerge(a, 0, a.length -1);
    	return a;
    	
   }//end mergeSortRecursive
    	
   private static void sortAndMerge(double [] a, int lo, int hi) {
	   if(hi<= lo) return; 
	   int mid = lo + (hi - lo) / 2;
	   sortAndMerge (a, lo, mid );
	   sortAndMerge (a, mid+1, hi ); 
	   merge(a, lo, mid, hi);
   }


   // Merges two subarrays of a[]. 
   // First subarray is a[l..mid] 
   // Second subarray is a[mid+1..hi] 
   static void merge(double [] a, int lo, int mid, int hi) 
   { 
       // Find sizes of two subarrays to be merged 
       int size1 = mid - lo + 1; 
       int size2 = hi - mid; 
 
       // Create temp arrays 
       double [] L = new double [size1]; 
       double [] R = new double [size2]; 
 
       //Copy data to temp arrays
       for (int i=0; i<size1; ++i) { 
           L[i] = a[lo + i]; 
       }
       for (int j=0; j<size2; ++j) {
           R[j] = a[mid + 1+ j]; 
       }
 
       // Merge the temp arrays 
 
       // Initial indexes of first and second subarrays 
       int i = 0, j = 0; 
 
       // Initial index of merged subarry array 
       int k = lo; 
       while (i < size1 && j < size2) 
       { 
           if (L[i] <= R[j]) 
           { 
               a[k] = L[i]; 
               i++; 
           } 
           else
           { 
               a[k] = R[j]; 
               j++; 
           } 
           k++; 
       } 
 
       // Copy remaining elements of L[] if any
       while (i < size1) 
       { 
           a[k] = L[i]; 
           i++; 
           k++; 
       } 
 
       // Copy remaining elements of R[] if any 
       while (j < size2) 
       { 
           a[k] = R[j]; 
           j++; 
           k++; 
       } 
   } 


    public static void main(String[] args) {

        //TODO: do experiments as per assignment instructions
    	double [] a = {1,2,3,4,5};
    	SortComparison.quickSort(a);
    	
    }

 }//end class

