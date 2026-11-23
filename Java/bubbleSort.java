// bubble sort
public class Main
{
	public static void main(String[] args) {
		int ar[] = {7,9,4,3,1,2,8,6,5,10};
		
		IO.println("Before sorting: ");
		displayAr(ar);
		
		// bubble sorting algorithm
		bubbleSort(ar);
		
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
	
	static void bubbleSort(int ar[]) {
	    
	    // i counts the no. of iterations which is n-1
		for (int i=1;i<ar.length;i++) {
		    
		    // j iterates over adjacent elements, which is n,n+1
		    for (int j=0;j<ar.length-1;j++) {
		        
		        // check if 1st element is more than 2nd one, if yes, just swap them so they in ascending
		        if (ar[j] > ar[j+1]) {
		            
		            int temp = ar[j];
		            ar[j] = ar[j+1];
		            ar[j+1] = temp;
		        }
		        
		    }
		}
	}
}
