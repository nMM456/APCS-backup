
public class reee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] List = {1, 2, 3, 4};
		for (int i=0;i<List.length/2;i++) {
			int temp = List[i];
			List[i] = List[List.length-i-1];
			List[List.length-i-1] = temp;
		}
		for (int i:List) System.out.println(i+" ");
	}

}
