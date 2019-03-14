/******************************************************************
 * A Project of Sorts
 * 
 * Implements Search Algorithms on integer arrays
 * Includes Linear and Binary searches
 * Binary Search requires a sorted list
 * All Search methods are static
 * All Search helper methods are private
 * 
 * @author Nicholas Markou
 *
 *******************************************************************/
public class Search 
{
	/**
	 * Implements a Linear Search
	 * Goes through a list filled with integers, searches through the list starting at the first number and goes up one spot each time.
	 * It repeats this until it finds the number and returns the spot it is located in the list
	 * If it is not found, it returns -1.
	 * @param list - integer list to search in
	 * @param num - integer to search for
	 * @return index of found item, -1 if not found
	 */
	public static int linearSearch(int[] list, int num)
	{
		for (int i=0;i<list.length;i++) {
			if (list[i] == num) return i;
		}
		return -1;
	}
	
	/**
	 * Implements a Binary Search
	 *    <Include Algorithm Steps here>
	 * Pre: list must be sorted
	 * 
	 * @param list - integer list to search in
	 * @param num - integer to search for
	 * @return index of found item, -1 if not found
	 */
	public static int binarySearch(int[] list, int num)
	{

	}
}
