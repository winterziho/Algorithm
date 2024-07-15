package Ch2;

import java.util.*;

public class Q10_me {

	public int solution(int n, int[][] arr) {

		int answer = 0;
		int min = 0;
		int min2 = 0;
		
		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < n + 1; j++) {
				
				min = Math.max(arr[i][j-1], arr[i][j+1]);
				min2 = Math.max(arr[i-1][j], arr[i+1][j]);
				
				if(arr[i][j] > Math.max(min, min2)) {
					answer ++;
					
				}
			}
		}
		return answer;

	}

	public static void main(String[] args) {

		Q10_me T = new Q10_me();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n+2][n+2];
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(T.solution(n, arr));

	}
}