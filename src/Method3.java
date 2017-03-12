import java.util.Arrays;
import java.util.Random;

/**
 * CSC 331 Programming Assignment 2
 * Method 3
 *
 * @author Scott Spurlock
 * @version 2/28/17
 */
public class Method3 {
	// For finding a random pivot in the partition method.
	private Random randGen = new Random();

	/**
	 * This method finds the k largest elements in an integer array
	 * by calling the selection method to find the location of the
	 * (n-k)th element, copying the k largest elements into an array,
	 * and then calling insertion sort on this array to put them in order.
	 * 
	 * @param arr: input array to be searched
	 * @param k: how many elements to select
	 * @return an array of size k holding the largest k elements of A
	 */
	public int[] findTopK(int[] arr, int k) {
		int[] results = new int[k];

		// TBD
		
		return results;
	}

	/**
	 * Return kth smallest element of array A between left..right
	 * @param A: input array of ints
	 * @param left: index of the left-most element to be considered
	 * @param right: index of the right-most element to be considered
	 * @param k: the order of the element to find
	 * @return final index of the pivot element
	 */
	public int selection(int[] A, int left, int right, int k) {
		// TBD
		return 0;
	}
	
	/**
	 * Partition the elements of an array A between left and right
	 * so that, for some pivot element, all the elements to its left
	 * are less and all the elements to its right are greater.
	 * Recommendation: pick the index of the pivot element randomly.
	 * 
	 * @param A: input array of ints
	 * @param left: index of the left-most element to be considered
	 * @param right: index of the right-most element to be considered
	 * @return final index of the pivot element
	 */
	public int partition(int[] A, int left, int right) {
		// TBD
		return 0;
	}

	/**
	 * Helper method to swap two elements in an array.
	 * @param A: array
	 * @param a: first index
	 * @param b: second index
	 */
	public  void swap(int[] A, int a, int b) {
		// TBD - should be 3 lines
	}	

	/**
	 * Sort the elements in the array A using insertion sort.
	 * @param A: input array of ints.
	 */
	public void insertion_sort(int[] A) {
		// TBD
	}
	
} // Method3
