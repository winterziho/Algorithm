package Ch2;

import java.util.*;

public class Q12 {

	public int solution(int n, int m, int[][] arr) {

		int answer = 0;
		int pi = 0;
		int pj = 0;
		
		for(int i = 1; i <= n; i ++) {
			for (int j = 1; j <= n; j ++) {
				int cnt = 0;
				for(int k = 0; k < m; k ++) {
					for(int s = 0; s < n; s++) {
						
						if(arr[k][s] == i) pi = s;
						if(arr[k][s] == j) pj = s;
						
					}
					if(pi < pj) cnt++;
					
					
				}
				if(cnt == m) answer ++;
			}
			
		}
		
		return answer;

	}

	public static void main(String[] args) {

		Q12 T = new Q12();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(T.solution(n,m, arr));

	}
}