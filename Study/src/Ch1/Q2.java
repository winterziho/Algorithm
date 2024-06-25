package Ch1;

import java.util.*;

public class Q2 {
	
	public String solution(String str) {
		
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}
	public static void main(String args[]) {
		
		Q2 T = new Q2();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}
}
