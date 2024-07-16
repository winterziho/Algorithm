package Ch3;

import java.util.*;

public class Q5 {

	public int solution(int n) {

		int answer = 0, sum = 0, lt = 1;

		for (int i = 1; i < n; i++) {
			
			sum += i;

			if (sum == n) {
				answer++;
			}

			while (sum >= n) {
				sum -= lt++;
				if (sum == n)
					answer++;
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