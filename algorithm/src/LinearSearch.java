
public class LinearSearch {
	public static void main(String[] args) {
		
		linearSearch(0, null);
	}
	public static int linearSearch(int key,int[] arr) {
		int i = 0;
		int n = arr.length;
		while(true) {
			if(i == n) return -1;
			if(arr[i] == key) return i;
			i++;
		}
	}
}