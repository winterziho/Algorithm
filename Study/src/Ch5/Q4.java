package Ch5;

import java.util.*;

public class Q4 {

	public void solution(String s) {
		
		Stack<Integer> stack = new Stack<>();
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) stack.push(x-48);
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(x == '+') stack.push(lt+rt);
				if(x == '-') stack.push(lt-rt);
				if(x == '*') stack.push(lt*rt);
				if(x == '/') stack.push(lt/rt);
			}
		}
		System.out.println(stack.get(0));
	}

	public static void main(String[] args) {

		Q4 T = new Q4();
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		T.solution(s);

	}
}