import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
    	int ar[] = {7,9,4,3,1,2,8,6,5,10};
    	int key = 8;
    	
    	IO.println("Original array");
    	displayAr(ar);
    	
    	//binarySearch
    	IO.println("\nUsing Binary Search");
    	int index = binarySearch(ar,key);
    	
		if (index == -1)
		    IO.println(key+ " not found in the array");
		else
		    IO.println(key+ " found at index " +index);
	}

  // traverses the array elements and displays them one by one
	static void displayAr(int ar[]) {
	    // i is for traversing the indexes
	    for (int i=0;i<ar.length;i++)
	    {
	        // ar[i] gets the element at index i 
	        IO.print(ar[i]+" ");
	    }
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
	 
	}
}
