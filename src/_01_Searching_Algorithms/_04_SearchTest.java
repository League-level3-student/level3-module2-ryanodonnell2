package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] test1 = {"5","3","32","7","457","0","8","1"};
		assertEquals(_00_LinearSearch.linearSearch(test1, "7"), 3);
		assertEquals(_00_LinearSearch.linearSearch(test1, "67"), -1);
		assertEquals(_00_LinearSearch.linearSearch(test1, "1"), 7);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] test2 = {1,2,4,5,7,8,10,15,20,26,30,48,79,106,160,190};
		assertEquals(_01_BinarySearch.binarySearch(test2, 0, test2.length-1, 5), 3);
		assertEquals(_01_BinarySearch.binarySearch(test2, 0, test2.length-1, 1),0);
		assertEquals(_01_BinarySearch.binarySearch(test2, 0, test2.length-1, 190), 15);
		assertEquals(_01_BinarySearch.binarySearch(test2, 0, test2.length-1, 6), -1);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] test3 = {5,8,12,16,19,40,200,560,654,853,967,1467,1589,2479,3578,3846,4129,4578,5827,6173,6394,7329,8293,9282,9731,10457};
		assertEquals(_02_InterpolationSearch.interpolationSearch(test3,40),5);
		assertEquals(_02_InterpolationSearch.interpolationSearch(test3,10457),test3.length-1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(test3,5),0);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] test4 = {5,8,12,16,19,40,200,560,654,853,967,1467,1589,2479,3578,3846,4129,4578,5827,6173,6394,7329,8293,9282,9731,10457};
		assertEquals(_02_InterpolationSearch.interpolationSearch(test4,40),5);
		assertEquals(_02_InterpolationSearch.interpolationSearch(test4,10457),test4.length-1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(test4,5),0);
	}
}
