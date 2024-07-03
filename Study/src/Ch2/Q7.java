package Ch2;

import java.util.*;

public class Q7 {

	public int solution(int n, int[] arr) {

		int answer = 0, cnt = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
				
			}
			else cnt = 0;
			
		}

		

		return answer;

	}

	public static void main(String[] args) {

		Q7 T = new Q7();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println(T.solution(n, arr));

	}
}