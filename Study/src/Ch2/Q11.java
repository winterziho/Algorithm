package Ch2;

import java.util.*;

public class Q11 {

	public int solution(int n, int[][] arr) {

		int answer = 0;
		int m = 0;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			cnt = 0;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
				
			}
			if (cnt > m) {
				m = cnt;
				answer = i + 1;
			}
			

		}
		return answer;

	}

	public static void main(String[] args) {

		Q11 T = new Q11();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(T.solution(n, arr));

	}
}