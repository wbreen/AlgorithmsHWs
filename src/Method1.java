
/**
 * CSC 331 Programming Assignment 2
 * Method 1
 *
 * @author Scott Spurlock and William Breen
 * @version 3/12/17
 */
public class Method1 {

	/**
	 * This method finds the k largest elements in an integer array
	 * by looping through the array k times, each time picking the largest.
	 * 
	 * Recommendation:
	 * To make sure we don't pick the same largest element more than once,
	 * declare an array of booleans to keep track of which elements
	 * have been selected.
	 *
	 * @param arr: input array to be searched
	 * @param k: how many elements to select
	 * @return an array of size k holding the largest k elements of A
	 */
	public int[] findTopK(int[] arr, int k) {
		//create all the required variables
		int arrLength = arr.length;
		int[] results = new int[k];
		//initializes all as false, so if it is chosen, change the same one to true
		boolean[] hasBeenChosen = new boolean[arrLength];
		
		//loop through the array k times, and put the max value found each time into the results array
		for (int i = 0; i<k; i++){
			//"largest" = the largest value, "largestLoc" = location of this value in array
			int largest = arr[0];
			int largestLoc = 0;
			
			for (int j = 0; j<arrLength; j++){
				if (arr[j] >= largest && !hasBeenChosen[j]){
					largest = arr[j];
					largestLoc = j;
				}
				
			}
			results[i] = largest;
			hasBeenChosen[largestLoc] = true;
		}
		
		
		return results;
	}


} // Method1
