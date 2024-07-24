package Ch6;

import java.util.*;

public class Q1 {

	public void solution(int n, int[] m) {

		int[] answer = new int[n];
		
		for(int i = 0; i < n; i ++) {
			for(int j = i+1; j < n; j ++) {
				if(m[i] > m[j]) {
					int idx = m[i];
					m[i] = m[j];
					m[j] = idx;
				}
			}
			answer[i] = m[i];
		}

		for(int i = 0; i < n; i ++) {
		System.out.print(answer[i] + " ");
		}
	}

	public static void main(String[] args) {

		Q1 T = new Q1();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] m = new int[n];
		
		for(int i = 0; i < n; i ++) {
			m[i] = sc.nextInt();
		}
		

		T.solution(n, m);

	}
}