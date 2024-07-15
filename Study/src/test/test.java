package test;

import java.util.*;

public class test {

	public int solution(int n, int[] a, int k) {

		int answer = 0;
		
		
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = 0; j < k; j++) {
				if(i + j < n) sum += a[i+j];
			}
			if(answer < sum) answer = sum;
			
		}
		return answer;
	}

	public static void main(String[] args) {

		test T = new test();

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