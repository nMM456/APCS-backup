
public class client {
	private static void randomArr20(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*41)-20;
		}
	}
	private static void randomArr(int[] arr, int num) {
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*num);
		}
	}
	private static void allSorts(int[][] arr) {
		Sort.bubbleSort(arr[0]);
		Sort.insertionSort(arr[1]);
		Sort.selectionSort(arr[2]);
		Sort.mergeSort(arr[3]);
		Sort.quickSort(arr[4]);
	}
	
	
	public static void main(String[] args) {
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
		Sort.insertionSort(insertion);
		System.out.println("\nInsertion sort: ");
		for (int i:insertion) {
			System.out.print(i+" ");
		}
		Sort.selectionSort(selection);
		System.out.println("\nSelection sort: ");
		for (int i:selection) {
			System.out.print(i+" ");
		}
//		Do recursive sorts here next.
//		test searches here
		int[][] oneK = new int[5][1000];
		for (int[] i: oneK) {
			randomArr(i, i.length);
		}
		int[][] fiveK = new int[5][5000];
		for (int[] i: fiveK) {
			randomArr(i, i.length);
		}
		int[][] tenK = new int[5][10000];
		for (int[] i: tenK) {
			randomArr(i, i.length);
		}
		int[][] fiftyK = new int[5][50000];
		for (int[] i: fiftyK) {
			randomArr(i, i.length);
		}
	}

}
