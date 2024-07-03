package Ch2;

import java.util.*;

public class Q5 {

	public int solution(int n) {

		int answer = 0;
		int[] s = new int[n + 1];
		
		for(int i = 2; i <= n; i++) {
			
			if(s[i] == 0) {
				answer++;
				for(int j = i; j <= n; j = j + i) s[j] = 1;
			}
		}
		return answer;
	}
	public static void main(String[] args) {

		Q5 T = new Q5();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(T.solution(n));

		

	}
}