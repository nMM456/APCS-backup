
public class Client {
	/**
	 * Fills array with random integers from -20 to 20.
	 * @param arr list to be filled with integers
	 */
	private static void randomArr20(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*41)-20;
		}
	}
	/**
	 * Fills array with random integers from 1 to value of num
	 * @param arr array of integers
	 * @param num largest random number to be generated
	 */
	private static void randomArr(int[] arr, int num) {
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*num);
		}
	}
	/**
	 * Goes through a 2D array and sorts them using all 5 sorts. 
	 * Each sort is timed and later printed out.
	 * @param arr 2D array which is already filled with random integers
	 */
	private static void allSorts(int[][] arr) {
		StopWatch1 bubbleTime = new StopWatch1();
		bubbleTime.start();
		Sort.bubbleSort(arr[0]);
		bubbleTime.stop();
		StopWatch1 insertionTime = new StopWatch1();
		insertionTime.start();
		Sort.insertionSort(arr[1]);
		insertionTime.stop();
		StopWatch1 selectionTime = new StopWatch1();
		selectionTime.start();
		Sort.selectionSort(arr[2]);
		selectionTime.stop();
		StopWatch1 mergeTime = new StopWatch1();
		mergeTime.start();
		Sort.mergeSort(arr[3]);
		mergeTime.stop();
		StopWatch1 quickTime = new StopWatch1();
		quickTime.start();
		Sort.quickSort(arr[4]);
		quickTime.stop();
		System.out.println();
		System.out.printf("%14s | %10s | %10s | %10s\n", "Sort Type", "Array Size", "Time (ms)", "Time (sec)");
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Bubble Sort", arr[0].length, bubbleTime.getElapsedTime(), bubbleTime.getElapsedTimeSecs());
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Insertion Sort", arr[1].length, insertionTime.getElapsedTime(), insertionTime.getElapsedTimeSecs());
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Selection Sort", arr[2].length, selectionTime.getElapsedTime(), selectionTime.getElapsedTimeSecs());
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Merge Sort", arr[3].length, mergeTime.getElapsedTime(), mergeTime.getElapsedTimeSecs());
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Quick Sort", arr[4].length, quickTime.getElapsedTime(), quickTime.getElapsedTimeSecs());
	}
	/**
	 * Goes through a 2D array and sorts them using every sorting algorithim except bubble sort.
	 * Each sort is timed and later printed out.
	 * @param arr 2D array which is filled with random integers
	 */
	private static void sortButBubble(int[][] arr) {
		StopWatch1 insertionTime = new StopWatch1();
		insertionTime.start();
		Sort.insertionSort(arr[0]);
		insertionTime.stop();
		StopWatch1 selectionTime = new StopWatch1();
		selectionTime.start();
		Sort.selectionSort(arr[1]);
		selectionTime.stop();
		StopWatch1 mergeTime = new StopWatch1();
		mergeTime.start();
		Sort.mergeSort(arr[2]);
		mergeTime.stop();
		StopWatch1 quickTime = new StopWatch1();
		quickTime.start();
		Sort.quickSort(arr[3]);
		quickTime.stop();
		System.out.println();
		System.out.printf("%14s | %10s | %10s | %10s\n", "Sort Type", "Array Size", "Time (ms)", "Time (sec)");
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Insertion Sort", arr[0].length, insertionTime.getElapsedTime(), insertionTime.getElapsedTimeSecs());
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Selection Sort", arr[1].length, selectionTime.getElapsedTime(), selectionTime.getElapsedTimeSecs());
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Merge Sort", arr[2].length, mergeTime.getElapsedTime(), mergeTime.getElapsedTimeSecs());
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Quick Sort", arr[3].length, quickTime.getElapsedTime(), quickTime.getElapsedTimeSecs());
	}
	/**
	 * Goes through a 2D array and sorts them using quick sort and merge sort.
	 * Each sort is time and later printed out. 
	 * @param arr 2D array which is filled with random integers.
	 */
	private static void quickMerge(int[][] arr) {
		StopWatch1 mergeTime = new StopWatch1();
		mergeTime.start();
		Sort.mergeSort(arr[0]);
		mergeTime.stop();
		StopWatch1 quickTime = new StopWatch1();
		quickTime.start();
		Sort.quickSort(arr[1]);
		quickTime.stop();
		System.out.println();
		System.out.printf("%14s | %10s | %10s | %10s\n", "Sort Type", "Array Size", "Time (ms)", "Time (sec)");
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Merge Sort", arr[0].length, mergeTime.getElapsedTime(), mergeTime.getElapsedTimeSecs());
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Quick Sort", arr[1].length, quickTime.getElapsedTime(), quickTime.getElapsedTimeSecs());
	}
	/**
	 * Takes a sorted array and reverses it.
	 * This results in a sorted array that is descending. 
	 * @param arr A sorted array filled with integers
	 */
	private static void reverse(int[] arr) {
		for (int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
	}
	/**
	 * This takes an array as the parameter and then returns a copy of it. 
	 * @param arr Array of integers to be copied
	 * @return Copy of parameter
	 */
	private static int[] copy(int[] arr) {
		int[] arrTwo = new int[arr.length];
		for (int i=0;i<arr.length;i++) {
			arrTwo[i] = arr[i];
		}
		return arrTwo;
	}
	/**
	 * This searches a given array filled with integers for a give number
	 * This times the search and prints the info after the search. 
	 * @param arr Array filled with integers to search in
	 * @param num Number to search for
	 */
	private static void linearTime(int[] arr, int num) {
		StopWatch1 s = new StopWatch1();
		System.out.println("Looking for the number "+num);
		s.start();
		int spot = Search.linearSearch(arr, num);
		s.stop();
		if (spot==-1) System.out.println("Number not found.");
		else System.out.println(num+" was found at " + spot);
		System.out.println();
		System.out.printf("%14s | %10s | %10s | %10s\n", "Search Type", "Array Size", "Time (ms)", "Time (sec)");
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Linear Search", arr.length, s.getElapsedTime(), s.getElapsedTimeSecs());
	}
	/**
	 * This searches a sorted array of integers for a given number using binary search.
	 * @param arr Array filled with integers to search in
	 * @param num Number to search for
	 */
	private static void binaryTime(int[] arr, int num) {
		StopWatch1 s = new StopWatch1();
		System.out.println("Looking for the number "+num);
		s.start();
		int spot = Search.binarySearch(arr, num);
		s.stop();
		if (spot==-1) System.out.println("Number was not found.");
		else System.out.println(num+" was found at "+spot);
		System.out.println();
		System.out.printf("%14s | %10s | %10s | %10s\n", "Search Type", "Array Size", "Time (ms)", "Time (sec)");
		System.out.printf("%14s | %10d | %7d ms | %10d\n", "Binary Search", arr.length, s.getElapsedTime(), s.getElapsedTimeSecs());
	}
	
	public static void main(String[] args) {
//		Testing sorts with small set of integers.
		int[] bubble = new int[20];
		int[] insertion = new int[20];
		int[] selection = new int[20];
		int[] merge = new int[20];
		int[] quick = new int[20];
		randomArr20(bubble);
		randomArr20(insertion);
		randomArr20(selection);
		randomArr20(merge);
		randomArr20(quick);
		Sort.bubbleSort(bubble);
		System.out.println("Bubble sort: ");
		for (int i:bubble) {
			System.out.print(i+" ");
		}
		System.out.println();
		Sort.insertionSort(insertion);
		System.out.println("\nInsertion sort: ");
		for (int i:insertion) {
			System.out.print(i+" ");
		}
		System.out.println();
		Sort.selectionSort(selection);
		System.out.println("\nSelection sort: ");
		for (int i:selection) {
			System.out.print(i+" ");
		}
		System.out.println();
		Sort.mergeSort(merge);
		System.out.println("\nMerge sort: ");
		for (int i:merge) {
			System.out.print(i+" ");
		}
		System.out.println();
		Sort.quickSort(quick);
		System.out.println("\nQuick sort: ");
		for (int i:quick) {
			System.out.print(i+" ");
		}
//		Testing searches
		System.out.println();
		int[] linearNum = new int[5];
		randomArr20(linearNum);
		for (int i:linearNum) {
			System.out.println("\nSearching for "+i+" in Bubble Sort array.");
			int pos = Search.linearSearch(bubble, i);
			if (pos == -1) System.out.println(i+" was not found.");
			else System.out.println("Found "+i+" at "+pos);
		}
		int[] binaryNum = new int[5];
		randomArr20(binaryNum);
		for (int i:binaryNum) {
			System.out.println("\nSearching for "+i+" in Bubble Sort array.");
			int pos = Search.binarySearch(bubble, i);
			if (pos == -1) System.out.println(i+" was not found.");
			else System.out.println("Found "+i+" at "+pos);
		}
		
		int[][] oneK = new int[5][1000];
		randomArr(oneK[0], oneK[0].length);
		for (int i=0;i<oneK.length;i++) {
			oneK[i] = copy(oneK[0]);
		}
		int[][] fiveK = new int[5][5000];
		randomArr(fiveK[0], fiveK[0].length);
		for (int i=0;i<fiveK.length;i++) {
			fiveK[i] = copy(fiveK[0]);
		}
		int[][] tenK = new int[5][10000];
		randomArr(tenK[0], tenK[0].length);
		for (int i=0;i<tenK.length;i++) {
			tenK[i] = copy(tenK[0]);
		}
		
		int[][] fiftyK = new int[5][50000];
		randomArr(fiftyK[0], fiftyK[0].length);
		for (int i=0;i<fiftyK.length;i++) {
			fiftyK[i] = copy(fiftyK[0]);
		}
//		Sorting the arrays with all 5 sorts.
		allSorts(oneK);
		allSorts(fiveK);
		allSorts(tenK);
		allSorts(fiftyK);
		
		int[][] hundredK = new int[4][100000];
		randomArr(hundredK[0], hundredK[0].length);
		for (int i=0;i<hundredK.length;i++) {
			hundredK[i] = copy(hundredK[0]);
		}
		
		int[][] fiveHundredK = new int[4][500000];
		randomArr(fiveHundredK[0], fiveHundredK[0].length);
		for (int i=0;i<fiveHundredK.length;i++) {
			fiveHundredK[i] = copy(fiveHundredK[0]);
		}
//		Sorts the arrays with everything but bubble sort.
		sortButBubble(hundredK);
		sortButBubble(fiveHundredK);
		
		int[][] oneM = new int[2][1000000];
		randomArr(oneM[0], oneM[0].length);
		for (int i=0;i<oneM.length;i++) {
			oneM[i] = copy(oneM[0]);
		}
		
		int[][] fiveM = new int[2][5000000];
		randomArr(fiveM[0], fiveM[0].length);
		for (int i=0;i<fiveM.length;i++) {
			fiveM[i] = copy(fiveM[0]);
		}
//		Sorts the arrays using quick and merge sort
		quickMerge(oneM);
		quickMerge(fiveM);
		
//		Special cases
		System.out.println("\nSpecial cases.");
		int[][] twoHundredK = new int[4][200000];
		randomArr(twoHundredK[0], twoHundredK[0].length);
		for (int i=0;i<twoHundredK.length;i++) {
			twoHundredK[i] = copy(twoHundredK[0]);
		}
		sortButBubble(twoHundredK);
		System.out.println("\nSorting an already sorted list.");
		sortButBubble(twoHundredK);
//		reverse
		System.out.println("\nReverse list");
		int[][] reverseSort = new int[4][200000];
		for (int[] i: reverseSort) {
			randomArr(i, i.length);
			Sort.quickSort(i);
		}
		for (int[] i: reverseSort) {
			reverse(i);
		}
		sortButBubble(reverseSort);
//		Array sized 1-20
		System.out.println("\nArray sized 1-20");
		int [][] oneToTwenty = new int[4][200000];
		for (int[] i: oneToTwenty) {
			randomArr(i, 20);
		}
		sortButBubble(oneToTwenty);
		System.out.println("\nSearches");
//		Searches
		System.out.println("\nUnsorted");
		int [] fiveMSearch = new int[5000000];
		randomArr(fiveMSearch, fiveMSearch.length);
		int[] nums = new int[5];
		for (int i=0;i<nums.length;i++) {
			nums[i] = (int)(Math.random()*5000000);
		}
		for (int num:nums) {
			linearTime(fiveMSearch, num);	
		}
//		Sorted Linear
		int [] fiveMSearchSorted = new int[5000000];
		randomArr(fiveMSearchSorted, fiveMSearchSorted.length);
		Sort.quickSort(fiveMSearchSorted);
		for (int i=0;i<nums.length;i++) {
			nums[i] = (int)(Math.random()*5000000);
		}
		for (int num:nums) {
			linearTime(fiveMSearchSorted, num);	
		}
//		Binary Search
		int [] fiveMBinary = new int[5000000];
		randomArr(fiveMBinary, fiveMBinary.length);
		Sort.quickSort(fiveMBinary);
		for (int i=0;i<nums.length;i++) {
			nums[i] = (int)(Math.random()*5000000);
		}
		for (int num:nums) {
			binaryTime(fiveMBinary, num);	
		}
		
	}
}
