/******************************************************************
 * A Project of Sorts
 * 
 * Implements Sort Algorithms on integer arrays
 * Includes Bubble, Insertion, Selection, Merge, and Quick Sorts
 * Merge and Quick Sorts are recursive
 * All Sort methods are static
 * All Sort helper methods are private
 * 
 * @author Nicholas Markou
 *
 *******************************************************************/
public class Sort
{
  
  /************************
   * Implements Bubble Sort
   *  1.Scan list and compare adjacent elements
   *  2.Swap if out of order and set a flag
   *  3.Repeat 1-2 until no swaps are made (flag is false)
   *    scanning one less at the end each pass
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void bubbleSort(int[] aSort)
  {
	int k=0;
	int num;
	boolean run=true;
	while (run==true) {
		k++;
		run=false;
		for (int i=0;i<aSort.length-k;i++) {
			if (aSort[i] > aSort[i+1]) {
				num = aSort[i];
				aSort[i] = aSort[i+1];
				aSort[i+1] = num;
				run=true;
				}
			}
		}
  }
  
  /************************
   * Implements Insertion Sort
   *  1.Start with a sorted list of one value
   *  2.Add another value and sort the values, placing in correct location
   *  3.Repeat 2-3 shifting sorted values to the right until it is placed
   *    in the correct position
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void insertionSort(int[] aSort)
  {
      for (int i=1;i<aSort.length;i++) {
          for (int j=0;j<i;j++) {
              if (aSort[i]<aSort[j]) {
                  int temp = aSort[j];
                  aSort[j] = aSort[i];
                  for (int k=j+1;k<=i;k++) {
                      int otherTemp = aSort[k];
                      aSort[k] = temp;
                      temp = otherTemp;
                  }
              }
          }
      }
  }
  
  /************************
   * Implements Selection Sort
   *  1.Scan the list to find the smallest value
   *  2.Swap with first position
   *  3.Repeat 1-2 Scanning and swapping with the next position in the list
   *    Until you are at the end of the list
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void selectionSort(int[] aSort)
  {
	  for (int i=0;i<aSort.length;i++) {
		  int min=i;
		  for (int k=i;k<aSort.length;k++) {
			  if (aSort[min]>aSort[k]) {
				  min=k;
				  }
			  }
		  int temp = aSort[i];
		  aSort[i]=aSort[min];
		  aSort[min] = temp;
		  }
	  }  
  
  /************************
   * Implements Merge Sort recursively
   *  1.Divide the list in half
   *  2.Sort each half (recursively)
   *  3.Merge the two sorted lists
   *  Note: Use indexes into the array to mark two sublists
   *        and a temporary array when merging
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void mergeSort(int[] aSort)
  {
    //Sort the entire list using a recursive merge sort method
    doMergeSort(aSort, 0, aSort.length-1);
  }
  private static void doMergeSort(int[] arr, int start, int end) {
	  if (start < end) {
		  int mid = (start + end)/2;
		  doMergeSort(arr, start, mid);
		  doMergeSort(arr, mid+1, end);
		  int[] secondArr = new int[end-start+1];
		  int firstIndex = start;
		  int secondIndex = mid+1;
		  int tempIndex = 0;
		  while (firstIndex <= mid && secondIndex <= end) {
			  if (arr[firstIndex] < arr[secondIndex]) {
				  secondArr[tempIndex] = arr[firstIndex];
				  firstIndex++;
			  }
			  else {
				  secondArr[tempIndex] = arr[secondIndex];
				  secondIndex++;
			  }
			  tempIndex++;
		  }
		  while (firstIndex <= mid) {
			  secondArr[tempIndex] = arr[firstIndex];
			  firstIndex++;
			  tempIndex++;
		  }
		  while (secondIndex <= end) {
			  secondArr[tempIndex] = arr[secondIndex];
			  secondIndex++;
			  tempIndex++;
		  }
		  for (tempIndex=0;tempIndex<secondArr.length;tempIndex++) {
			  arr[start+tempIndex] = secondArr[tempIndex];
		  }
	  }
  }
  /************************
   * Implements Quick Sort recursively
   *  1.Divide into two sublists, < and > a pivot value
   *  2.Recursively sort each sublist
   *  Use the first element in the list as the pivot
   *  Note: Use indexes into the array to mark two sublists
   * Pre: unsorted array parameter
   * Post: sorted array parameter
   * 
   * @param aSort integer array
   **/
  public static void quickSort(int[] aSort)
  {
    //Sort the entire list using the recursive quick sort method
    doQuickSort(aSort, 0, aSort.length-1);
  }
  private static void doQuickSort(int[] arr, int start, int end) {
	  if (start < end) {
		  int mid = partition(arr, start, end);
		  doQuickSort(arr, start, mid);
		  doQuickSort(arr, mid+1, end);
	  }
  }
  private static int partition(int[] arr, int start, int end) {
	  int pivot = arr[(start+end)/2];
	  int i = start - 1;
	  int k = end + 1;
	  while (true) {
		  i++;
		  while (arr[i] < pivot) i++;
		  k--;
		  while (arr[k] > pivot) k--;
		  if (i<k) {
			  int temp = arr[i];
			  arr[i] = arr[k];
			  arr[k] = temp;
		  }
		  else return k;
	  }
  }
}