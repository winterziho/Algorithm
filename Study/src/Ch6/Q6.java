package Ch6;

import java.util.*;

public class Q6 {

	public void solution(int n, int[] arr) {

		int[] m = Arrays.copyOf(arr, n);
		Arrays.sort(arr);
		
		
		for(int i = 0; i < n; i ++) {
			if(m[i] != arr[i]) System.out.print(i+1 + " ");
		}
	}

	public static void main(String[] args) {

		Q6 T = new Q6();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		
		T.solution(n,arr);
		
	}
}