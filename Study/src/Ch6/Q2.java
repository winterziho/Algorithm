package Ch6;

import java.util.*;

public class Q2 {

	public void solution(int n, int[] m) {

		int[] answer = new int[n];
		int tmp;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1-i; j++) {
				if(m[j] > m[j+1]) {
					tmp = m[j];
					m[j] = m[j+1];
					m[j+1] = tmp;
				}
			}
		}
		for(int x : m) {
			System.out.print(x + " ");
		}
	}

	public static void main(String[] args) {

		Q2 T = new Q2();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] m = new int[n];
		
		for(int i = 0; i < n; i ++) {
			m[i] = sc.nextInt();
		}
		

		T.solution(n, m);

	}
}