package Ch8;

import java.util.*;

public class Q2 {
	
	static int c, n, answer = 0;
	static int[] arr;
	
	public int DFS(int L, int sum, int[] arr) {
		if(L==n) {
			if(sum<c) answer = Math.max(sum, answer);
		}else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		return answer;
	}
	

	public static void main(String[] args) {

		Q2 T = new Q2();

		Scanner sc = new Scanner(System.in);
		
		c = sc.nextInt();
		n = sc.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.DFS(0, 0, arr));
		
		
	}
}