package Ch8;

import java.util.*;

public class Q3 {
	
	static int n, m, answer = 0;
	
	public int DFS(int L, int sum, int sumMin, int[] score, int[] min) {
		
		if(L==n) {
			if(sumMin<=m) {
				answer = Math.max(sum, answer);
			}
			
		}else {
			DFS(L+1, sum+score[L], sumMin+min[L], score, min);
			DFS(L+1, sum, sumMin, score, min);
		}
		return answer;
	}
	

	public static void main(String[] args) {

		Q3 T = new Q3();

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		int[] score = new int[n];
		int[] min = new int[n];
		
		for(int i=0; i<n; i++) {
			score[i] = sc.nextInt();
			min[i] = sc.nextInt();
		}
		System.out.println(T.DFS(0, 0, 0, score, min));
		
	
		
		
	}
}