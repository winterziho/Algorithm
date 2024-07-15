package Ch2;

import java.util.*;

public class Q8 {

	public int[] solution(int n, int[] arr) {

		int[] answer = new int[n];
		
		for(int i = 0; i < n; i ++) {
			int cnt = 1;
			for(int j = 0; j < n; j ++) {
				if(arr[i] < arr[j]) {
					cnt++;
				}
				answer[i] = cnt;
			}
		}
		
		for(int x : answer) System.out.print(x + " ");
		return answer;

	}

	public static void main(String[] args) {

		Q8 T = new Q8();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		T.solution(n, arr);

	}
}