package _99_extra.recursion_practice;

public class Factorial {
	/*
	  Factorial is the operation that returns the product (multiplication)
	  of all of the positive integers between n and 0.
	 
	  e.g. 
	  5! = 5*4*3*2*1 = 120
	 */
	public static int factorial(int n) {
		//1. If n is zero
		if(n==0) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("!5 is " + factorial(5));
	}
}
