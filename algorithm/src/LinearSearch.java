import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
//		int[] arr = new int[num+1];
		
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		
		int key = sc.nextInt();
//		int result = linearSearch(key, arr);
		
//		if(result == -1) System.out.println("값없음");
//		else System.out.println((result+1) + "번째에 있음");
		int[] idx = new int[num];
		int result = searchIdx(arr, num, key, idx);
		System.out.println(result);
	}
	/**
	 * 보초법을 이용한 선형검색
	 * @param key 찾으려는 값
 	 * @param arr 주어진 배열
	 * @return key 값의 위치
	 */
	public static int linearSearch(int key, int[] arr) {
		int n = arr.length;
		arr[n-1] = key;
		int idx = 0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				idx = i;
				break;
			}
		}
		if(idx == n-1) return -1;
		else return idx;
	}
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int idxLength = 0;
		for(int i=0;i<n;i++) {
			if(a[i] == key) {
				idx[idxLength++] = i;
			}
		}
		for(int x: idx) System.out.print(x + " ");
		return idxLength;
	}
}