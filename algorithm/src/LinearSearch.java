import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num+1];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		
		int key = sc.nextInt();
		int result = linearSearch(key, arr);
		if(result == -1) System.out.println("값없음");
		else System.out.println((result+1) + "번째에 있음");
	}
	public static int linearSearch(int key,int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i] == key) return i;
		}
		return -1;
	}
}