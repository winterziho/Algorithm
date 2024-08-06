package Ch8;

import java.util.*;

public class Q5 {
	
	static int n, m, answer = Integer.MAX_VALUE;
	
	
	public void DFS(int L, int sum, Integer[] arr) {
		if(answer<=L) return;
		if(sum>m) return;
		if(sum==m) {
			answer = Math.min(L, answer);
			
		}else {
			for(int i=0; i<n; i++) {
				DFS(L+1, sum+arr[i], arr);
			}
		}
	}
	
	public static void main(String[] args) {
		Q5 T = new Q5();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		Integer[] arr = new Integer[n];
		for(int i = 0; i<n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr, Collections.reverseOrder());
		m = sc.nextInt();
		
		T.DFS(0,0,arr);
		System.out.println(answer);
	}

}
