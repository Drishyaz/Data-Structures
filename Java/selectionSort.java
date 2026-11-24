// selection sort
public class Main
{
	public static void main(String[] args) {
		int ar[] = {7,9,4,3,1,2,8,6,5,10};
		
		IO.println("Before sorting: ");
		displayAr(ar);
		
		// selection sorting algorithm
		selectionSort(ar);
		
		IO.println("\nAfter sorting: ");
		displayAr(ar);
	}
	
	static void displayAr(int ar[]) {
	    // i is for traversing the indexes
	    for (int i=0;i<ar.length;i++)
	    {
	        // ar[i] gets the element at index i 
	        IO.print(ar[i]+" ");
	    }
	}
	
	static void selectionSort(int ar[])
	{

        int head=0, min=0;
	    
	    // i counts the no. of iterations which is n-1
		for (int i=0;i<ar.length-1;i++) {
		   
		   // assume the current position as min 
		    min = i;
		    
		    // j iterates over the entire array to find the minimum
		    for (int j=head+1;j<ar.length;j++) {
		        
		        // finds the minimum
		        if (ar[j] < ar[min]) {
		            min = j;
		        }
		    }
		    
    		// after minimum found swap it with the head element
		    int temp = ar[head];
		    ar[head] = ar[min];
		    ar[min] = temp;
	        
	        // after every swap, increment the head 
		    head++;
		    
		}
	}
}
