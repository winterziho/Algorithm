package Ch2;

import java.util.*;

public class Q2 {

	public int solution(int n, int[] arr) {

		int answer = 1;
		int m = arr[0];
		
		for(int i = 1; i < n; i ++) {
			
			if(arr[i]>m) {
				
				m = arr[i];
				answer++;
			}
		}
	
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {

		Q2 T = new Q2();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(T.solution(n, arr));

	}
}