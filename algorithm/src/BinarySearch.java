import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {5,7,15,28,29,31,39,58,68,70,95};
		int[] arr2 = {1,3,5,7,7,7,7,8,8,9,9};
		int key = 39;
		int key2 = 7;
		
//		int result = binSearch(arr, key);
//		if(result != -1) System.out.println(result + "에 있음");
//		else System.out.println("없음");
		
		int binXResult = binSearchX(arr2, key2);
		if(binXResult != -1) System.out.println("제일 앞 값: " + binXResult);
		else System.out.println("없음");
	}
	static int binSearch(int[] arr, int key) {
		int pl=0,pr=arr.length-1;
		int pc;
		boolean flag = false;
		
		do {
			pc = (pl + pr) / 2;
			if(arr[pc] == key) {
				flag = true;
				break;
			} else if(arr[pc] > key) {
				pr = pc - 1;
			} else if(arr[pc] < key) {
				pl = pc + 1;
			}
		} while(pl != pc);
		
		if(flag) return pc;
		else return -1;
		
	}
	static int binSearchX(int[] arr, int key) {
		int binSearchResult = binSearch(arr, key);
		if(binSearchResult != -1) {
			int idx = 0;
			for(int i=binSearchResult;i>=0; i--) {
				if(arr[i] == key) idx = i;
			}
			return idx;
		} else return binSearchResult;
	}
}
