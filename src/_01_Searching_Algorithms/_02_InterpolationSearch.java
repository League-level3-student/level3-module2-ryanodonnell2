package _01_Searching_Algorithms;

public class _02_InterpolationSearch {
	// Interpolation search is an efficient searching algorithm 
	// for when the data is in order and uniformly distributed.
	// e.g. {1, 2, 3, 4, 5, ... }
	//      {2, 4, 6, 8, 10, ... }
	//      {6, 12, 18, 24, 30, ... }
	//      {100, 200, 300, 400, 500, ... }
	
	//1. Complete the steps in the interpolationSearch method
	//   We can assume array is already sorted and uniformly distributed
	public static int interpolationSearch(int[] array, int value)
    {
        //2. create two integers called start and end.
		//   initialize them to 0 and the length of the array minus one
		//   respectively
		int start = 0;
		int end = array.length-1;
        //3. Make a while loop that runs while the following conditions are true:
        //   start is less than or equal to end
        //   value is greater than or equal to the array element at start
        //   value is less than or equal to the array element at end
		while(start<=end && value>=array[start] && value<=array[end]) {
			if(start==end) {
				if(array[start]==value) {
					return start;					
				}
				else {
					return -1;
				}
			}
		//4. If start is equal to end,
		//     then check if the array element at start is equal to the value
		//     and return start if it is, otherwise return -1.
		
		//5. create an integer called position
        	//  initialize it to the following:
        	//  start + (((end - start) * (value - array[start])) / (array[end] - array[start]));
        	//  This calculates the center of the array keeping the even distribution in mind.
			int position = start + (((end - start) * (value - array[start])) / (array[end] - array[start]));
			if(array[position]==value) {
				return position;
			}
            //6. if the array element at position is equal to the value,
            //   then we found it and can return position.
			
            //7. if the array element at position is less than value,
            //   then set start equal to position plus one
			if(array[position]<value) {
				start = position+1;
			}
			else {
				end = position-1;
			}
            //8. otherwise, set end equal to position minus one
		}
        //9. Return -1 because the value was not found
        return -1;
    }
}
