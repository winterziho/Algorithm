package Ch3;

import java.util.*;

public class Q4 {

	public int solution(int n, int[] a, int k) {

		int answer = 0, sum = 0, s = 0;
		
		for(int i = 0; i < n; i ++) {
			
			sum += a[i];
			
			if(sum == k) answer++;
			
			while(sum>=k) {
				sum -= a[s++];
				if(sum == k) answer++;
			}
			
			
		}
		return answer;
	}

	public static void main(String[] args) {

		Q4 T = new Q4();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		int k = sc.nextInt();
		for(int i = 0; i < n; i ++) {
			a[i] = sc.nextInt();
		}
		

		System.out.println(T.solution(n, a, k));

	}
}