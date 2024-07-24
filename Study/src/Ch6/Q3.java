package Ch6;

import java.util.*;



public class Q3 {

	public void solution(int n, int[] m) {

		int tmp ,j;
		for(int i = 1; i < n; i++) {
			tmp = m[i];
			for(j = i-1; j >=0; j--) {
				if(m[j]>tmp) m[j+1] = m[j];
				else break;
			}
			m[j+1] = tmp;
		}
	}

	public static void main(String[] args) {

		Q3 T = new Q3();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] m = new int[n];
		
		for(int i = 0; i < n; i ++) {
			m[i] = sc.nextInt();
		}
		

		T.solution(n, m);

	}
}