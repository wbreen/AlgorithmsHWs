/**
 * CSC 331 Programming Assignment 2
 * This is the driver class that will create instances of
 * the 3 method classes to test them.
 *
 * @author Scott Spurlock
 * @version 2/28/17
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PA2 {

	public static void main(String[] args) {
		Method1 method1 = new Method1();
		Method2 method2 = new Method2();
		Method3 method3 = new Method3();
		
		int [] testArray;
		int testK = 10;

		// -----------------------------------------------------
		// Functionality Tests
		// Test each method on the provided test data, which consists of
		// 100 integers (one per line). Use k = 10. Include the output from
		// each method in your readme file.
		System.out.println("Functionality Tests...");
		
		System.out.println("TBD");
		

		
		// A. Read test data from file into array
		try {
			testArray = readToArray();
			int [] method1Out = method1.findTopK(testArray, testK);
			int [] method2Out = method2.findTopK(testArray, testK);
			int [] method3Out = method3.findTopK(testArray, testK);
			
			//method 1
			System.out.print("Method 1: ");
			for(int i = 0; i<method1Out.length; i++){
				System.out.print(method1Out[i] + ", ");
			}
			//print line for separation 
			System.out.println(" ");
			
			//method 2
			System.out.print("Method 2: ");
			for (int i = 0; i<method2Out.length; i++){
				System.out.print(method2Out[i] +", ");
			}
			System.out.println(" ");
			
			//method 3
			System.out.print("Method 3: ");
			for (int i = 0; i<method3Out.length; i++){
				System.out.print(method3Out[i] + ", ");
			}
			System.out.println(" ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println(testArray);
		
		
		// B. Test each method with the same test data. 
		// (Make sure to clone the array for testing each method so the original isn't changed.)
		
		// -----------------------------------------------------
		// Timing Tests
		// Use a random number generator to generate 10,000 elements and run 
		// the three different algorithms to find the 500 largest elements. 
		// Take the average over 10 experiments for each algorithm and compare the results.
		System.out.println();
		System.out.println("Timing Tests...");
		System.out.println("TBD");
		int K = 500;

		// Run tests to time each method on random data

		// A. For each experiment, create an array of 10,000 random integers
		// Make sure to clone the array for testing each method so the original isn't changed.
		// Use System.nanoTime() to get the runtime for each method.
		// E.g., 
		//			int[] output = new int[K];
		//			long start = System.nanoTime();
		//			output = method1.findTopK(testData1, K);
		//			long end = System.nanoTime();
		//			long timeResults1 = end - start;

	} // end main
	
	
	
	
	//creating the array of the numbers given in the pa2_input file
	public static int[] readToArray() throws IOException{
		File input = new File("pa2_input.txt");
		Scanner sc = null;
		int [] outputArray = new int[100];
		
		try{
			sc = new Scanner(input);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		for (int i = 0; i<100; i++){
			outputArray[i] = sc.nextInt();
		}
//		for (int i = 0; i<100; i++){
//			System.out.print(outputArray[i] +", ");
//		}
		
		return outputArray;
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
