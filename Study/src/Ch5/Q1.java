package Ch5;

import java.util.*;

public class Q1 {

	public String solution(String a) {

		String answer = "YES";
		Stack<Character> stack = new Stack<>();
		
		for(char x : a.toCharArray()) {
			if(x == '(') {
				stack.push(x);
			}else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
			
		}
		if(!stack.isEmpty()) return "NO";
		
		return answer;
		
	}

	public static void main(String[] args) {

		Q1 T = new Q1();
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		System.out.println(T.solution(a));

	}
}