
public class CountingSort {
	public static void main(String[] args) {
		int[] arr = {1,3,1,4,5,2,2,7,1,6,9,10,9,2,1};
		countSort(arr);
		for(int a :arr) {
			System.out.print(a+ ", ");
		}
	}
	public static void countSort(int[] arr) {
		int[] temp = new int[11];
		for(int i =0 ; i<arr.length; i++) {
			temp[arr[i]]++;
		}
		int x = 0;
		for(int j =0 ; j<temp.length; j++) {
			for(int k =0; k<temp[j]; k++) {
				arr[x]=j;
				x++;
			}
		}
		
		
	}

}
