// interpolation Search
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int ar[] = {7,9,4,3,1,2,8,6,5,10};
		int key = Scanner().nextInt();
		
		IO.println("Array: ");
		displayAr(ar);
		
		// interpolation search algorithm
		int index = interpolationSearch(ar,key);
	}
	
	static void displayAr(int ar[]) {
	    // i is for traversing the indexes
	    for (int i=0;i<ar.length;i++)
	    {
	        // ar[i] gets the element at index i 
	        IO.print(ar[i]+" ");
	    }
	}

  // understanding and implementing... be patient..
	static void interpolationSearch(int ar[]) {
	    Arrays.sort(ar);
	    
	    for (int )
	}
}
