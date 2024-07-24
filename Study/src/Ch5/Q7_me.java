package Ch5;

import java.util.*;

public class Q7_me {

	public void solution(String n, String s) {

		Queue<Character> Q = new LinkedList<>();
		String answer = "YES";
		int cnt = 0;

		for (char x : n.toCharArray()) {
			Q.add(x);
			cnt++;
		}

		while (Q.size() != 0) {
			char k = Q.poll();
			for (char x : s.toCharArray()) {
				if(x == k) {
					cnt--;
				}

			}
		}

		if (cnt != 0)
			answer = "NO";

		System.out.println(answer);

	}

	public static void main(String[] args) {

		Q7_me T = new Q7_me();

		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		String s = sc.next();

		T.solution(n, s);

	}
}