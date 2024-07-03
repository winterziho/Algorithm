package test;

import java.util.*;

public class test {

	public int solution(int n, int[] arr) {

		int answer = arr[0];
		int[] s = new int[n];
		s[0] = arr[0];
		
		for(int i = 1; i < n; i++) {
			
			if(arr[i] == 1) {
				s[i] = (s[i-1] + 1);
				answer += s[i];
			}
		}

		

		return answer;

	}

	public static void main(String[] args) {

		test T = new test();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.println(T.solution(n, arr));

	}
}