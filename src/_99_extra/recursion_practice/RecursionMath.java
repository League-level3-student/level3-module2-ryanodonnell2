package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1
		if(times == 1) {
			return number; 
		}
		//4. else return number + recursionMultiplication(number, times-1)
		else {
			return number + recursiveMultiplication(number, times-1);
		}
	}
	
	//6. Try this one on your own! 
	//Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if(number<numberToDivideBy) {
			return number;
		}
		else {
			number = number/numberToDivideBy;
			return recursiveDivision(number, numberToDivideBy);
		}
	}
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power, int originalNumber) {
		if(1==power) {
			return number;
		}
		else {
			number*=originalNumber;
			power--;
			return recursivePower(number, power, originalNumber);
		}
	}
	
	
	
	@Test
	public void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		assertEquals(18, recursiveMultiplication(3, 6));
		//1  Add more JUnit tests like the one above to test your method
		
	}
	
	
	@Test
	public void testDivision() {
		assertEquals(4, recursiveDivision(24, 6));
		assertEquals(4, recursiveDivision(48, 12));
		
		//5  Add JUnit tests to test your method
		
	}
	
	
	@Test 
	public void testPower() {
		assertEquals(1, recursivePower(1,5, 1));
		System.out.println("");
		assertEquals(4, recursivePower(2,2,2));
		System.out.println("");
		assertEquals(27, recursivePower(3,3,3));
		//7  Add JUnit tests to test your method
	
	}
	
}
