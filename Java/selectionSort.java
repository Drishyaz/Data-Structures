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

 // int head=0;
	    
	//     // i counts the no. of iterations which is n-1
	// 	for (int i=1;i<ar.length;i++) {
		    
	// 	    // j iterates over the entire array to find the minimum
	// 	    for (int j=0;j<ar.length-1;j++) {
		        
	// 	        // finds the minimum
	// 	        if (ar[j+1] < ar[j]) {
		            
	// 	            int temp = ar[j];
	// 	            ar[j] = ar[j+1];
	// 	            ar[j+1] = temp;
