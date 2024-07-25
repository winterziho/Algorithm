package Ch6;

import java.util.*;


public class Q8 {

	public void solution(int n, int k, int[] arr) {

		int answer = 0;
		
		Arrays.sort(arr);
		
		int lt = 0, rt = n-1;
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(arr[mid] == k) {
				answer = mid + 1;
				break;
			}
			if(arr[mid] > k) rt = mid - 1;
			else lt = mid+1;
		}
		System.out.println(answer);
	}

	public static void main(String[] args) {

		Q8 T = new Q8();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		T.solution(n, k, arr);
		
	}
}