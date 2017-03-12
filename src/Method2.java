import java.util.Arrays;

/**
 * CSC 331 Programming Assignment 2
 * Method 2
 *
 * @author Scott Spurlock and William Breen
 * @version 2/28/17
 */
public class Method2 {

	/**
	 * This method finds the k largest elements in an integer array
	 * by first sorting the array and then selecting the last K elements.
	 * 
	 * @param arr: input array to be searched
	 * @param k: how many elements to select
	 * @return an array of size k holding the largest k elements of A
	 */
	public int[] findTopK(int[] arr, int k) {
		int[] results = new int[k];
		int length = arr.length-1;
		

		// sort the array, then read from the end
		Arrays.sort(arr);
		int resultArrayCounter = 0;
		for (int i = length; i>length - k; i--){
			results[resultArrayCounter] = arr[i];
			resultArrayCounter++;
		}
		
		
		return results;
	}
} // Method2
