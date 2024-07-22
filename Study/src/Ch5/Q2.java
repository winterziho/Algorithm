package Ch5;

import java.util.*;

public class Q2 {

	public void solution(String a) {

		
		Stack<Character> stack = new Stack<>();
		
		for(char x : a.toCharArray()) {
			if(x == ')') {
				while(stack.pop() != '(');
				
			}else stack.push(x);
		}
		for(char x : stack) {
			System.out.print(x );
		}
		
		
	}

	public static void main(String[] args) {

		Q2 T = new Q2();
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		T.solution(a);

	}
}