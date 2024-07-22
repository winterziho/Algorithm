package Ch5;

import java.util.*;

public class Q5 {

	public void solution(String s) {
		
		char[] arr = s.toCharArray();
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] == '(') stack.push(arr[i]);
			else {
				if(arr[i-1] == '(') {
					stack.pop();
					answer+=stack.size();
				}else {
					stack.pop();
					answer+=1;
				}
			}
		}
		System.out.println(answer);
	}

	public static void main(String[] args) {

		Q5 T = new Q5();
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		T.solution(s);

	}
}