package Ch5;

import java.util.*;

public class Q7 {

	public void solution(String n, String s) {

		Queue<Character> Q = new LinkedList<>();
		String answer = "YES";
		

		for (char x : n.toCharArray()) {
			Q.add(x);
			
		}

		for(char x : s.toCharArray()) {
			if(Q.contains(x)) {
				if(x != Q.poll()) answer = "NO";
			}
		}

		

		System.out.println(answer);

	}

	public static void main(String[] args) {

		Q7 T = new Q7();

		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		String s = sc.next();

		T.solution(n, s);

	}
}