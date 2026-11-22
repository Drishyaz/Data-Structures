import java.util.Arrays;
public class Main    // the class name for this file is Main.class
{
	public static void main(String[] args) {
    	int ar[] = {7,9,4,3,1,2,8,6,5,10};
    	int found;      // will keep track of the index where key element is found
    	int key = 5;    // key element is 5, which we need to find in the array
 
    	//linearSearch
    	IO.println("Using Linear Search");
    	found = linearSearch(ar,5);
    	
    	if (found == -1)
    	    IO.println(key+" not found in array");
    	else
    	    IO.println(key+" found at index "+found);
    	    // In current java versions we can use IO.println() in place of S.O.Pln();
    	
    	//binarySearch
    	IO.println("\nUsing Binary Search");
    	found = binarySearch(ar,5);
    	
    	if (found == -1)
    	    IO.println(key+" not found in array");
    	else
    	    IO.println(key+" found at index "+found);
    	    // In current java versions we can use IO.println() in place of S.O.Pln();
    	
    	//some randomSearch() - will experiement later    	
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
	    int low = 0, high = ar.length-1;
	    int mid = (low+high)/2; 
	  
	    //working on it
	    return mid;                     // the loop will break if ar[mid] = key
	}
}
