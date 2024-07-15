package Ch2;

import java.util.*;

public class Q9 {

	public int solution(int n, int[][] arr) {

		int answer = 0;
		int min = 0;
		int min2 = 0;
		int min3 = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				min += arr[i][j];
				min2 += arr[j][i];
				if(i == j) min3 += arr[i][j];

			}
			answer = Math.max(answer, Math.max(min, min2));
			
			min = 0;
			min2 = 0;

		}

		answer = Math.max(answer, min3);
		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {

		Q9 T = new Q9();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		T.solution(n, arr);

	}
}