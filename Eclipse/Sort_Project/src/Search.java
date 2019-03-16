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
	 * 1. It sees if the number is greater than, smaller than or equal to the middle value.
	 * 2. If it is smaller, it calls the method again but with the first half of the list.
	 * 3. If it is larger, it calls the method again but with the second half of the list.
	 * 4. If it is equal, it returns the position of the number.
	 * It repeats these steps each time it makes the list smaller until it finds the number.
	 * Pre: list must be sorted
	 * 
	 * @param list - integer list to search in
	 * @param num - integer to search for
	 * @return index of found item, -1 if not found
	 */
	public static int binarySearch(int[] list, int num)
	{
		return doBinarySearch(list, num, 0, list.length-1);
	}
	private static int doBinarySearch(int[] list, int num, int start, int end) {
		if (start<=end) {
			int mid = (start+end)/2;
			if (list[mid]>num) return doBinarySearch(list, num, start, mid-1);
			else if (list[mid]<num) return doBinarySearch(list,num,mid+1, end);
			else return mid;
		}
		return -1;
	}
}