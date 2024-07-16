package Ch3;

import java.util.*;

public class Q3 {

	public int solution(int n, int[] a, int k) {

		int answer = 0, sum = 0;
		
		for(int i = 0 ; i < k; i++) {
			sum+= a[i];
		}
		answer = sum;
		System.out.println(sum);
		
		for(int i = k; i < n; i++) {
			sum+= a[i] - a[i-k];
			answer = Math.max(answer, sum);
		}
		System.out.println(sum);
//		for(int i = 0; i < n; i++) {
//			int sum = 0;
//			for(int j = 0; j < k; j++) {
//				if(i + j < n) sum += a[i+j];
//			}
//			if(answer < sum) answer = sum;
//			
//		}
		return answer;
	}

	public static void main(String[] args) {

		Q3 T = new Q3();

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