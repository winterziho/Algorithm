package test;

import java.util.*;

public class test {

	public ArrayList<Integer> solution(int n) {

		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(1);
		answer.add(1);
		
		for(int i = 2; i < n; i ++) {
			int ans = answer.get(i-1) + answer.get(i-2);
			answer.add(ans);
			
		}
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {

		test T = new test();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int x : T.solution(n)) {
			System.out.print(x + " ");
		}

		

	}
}