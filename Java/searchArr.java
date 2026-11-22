import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
    	int ar[] = {7,9,4,3,1,2,8,6,5,10};
    	int found;      // will keep track of the index where key element is found
    	int key = 7;    // key element which we need to find in the array
 
    	//linearSearch
    	IO.println("Using Linear Search");
    	found = linearSearch(ar,key);
		elementFound(found,key);
    	
    	//binarySearch
    	IO.println("\nUsing Binary Search");
    	found = binarySearch(ar,key);
		elementFound(found,key);
  
    	//some randomSearch()
	}

	static void elementFound(int key, int found)
	{
	    if (found == -1)
	        IO.println(key+" not found in array");
        else
            IO.println(key+" found at index "+found);
            // In current java versions we can use IO.println() in place of S.O.Pln();
	}
	
	static int linearSearch(int[] ar, int key) {
	    for (int i=0;i<ar.length;i++)
	    {
	        if (ar[i] == key)
	            return i;   // returns the index where key element found
	    }
	    return -1;          // returns -1 if key element not found
	}
	
	static int binarySearch(int[] ar, int key) {
	    Arrays.sort(ar);   
	    
	    // binarySearch algorithm
	    int low = 0, high = ar.length-1, mid=0;
	  
	    while (low <= high) {        
            mid = (low+high)/2; 
	        
	        if (key > ar[mid])
	            low = mid + 1;  
            else if (key == ar[mid])
                return mid; 
	        else                        // means the (key < ar[mid]) -> so key must be in the left subArray
	            high = mid - 1; 
	    }
	    return -1;                  // since key still not found even after searching entire array, so return -1
	    
	    // index of binarySearch() will not match with linearSearch() since the array in binarySearch() is sorted
	}
}
