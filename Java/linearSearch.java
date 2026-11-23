import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
    	int ar[] = {7,9,4,3,1,2,8,6,5,10};
    	int key = 8;
    	
    	IO.println("Original array");
    	displayAr(ar);
    	
    	//linearSearch
    	IO.println("\nUsing Linear Search");
    	int index = linearSearch(ar,key);
    	
		if (index == -1)
		    IO.println(key+ " not found in the array");
		else
		    IO.println(key+ " found at index " +index);
	}
	
	static void displayAr(int ar[]) {
	    // i is for traversing the indexes
	    for (int i=0;i<ar.length;i++)
	    {
	        // ar[i] gets the element at index i 
	        IO.print(ar[i]+" ");
	    }
	}
	
	static int linearSearch(int[] ar, int key) {
	    for (int i=0;i<ar.length;i++)
	    {
	        if (ar[i] == key)
	            return i;   // returns the index where key element found
	    }
	    return -1;          // returns -1 if key element not found
	}
}
