package Ch1;

import java.util.*;

public class Q10 {

	public String solution(String str, char c) {

		String answer =" ";
		int count = 1000;
		
		char[] s = str.toCharArray();
		int[] n = new int[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			
			if(s[i] == c) {
				count = 0;
				n[i] = count;
				
			}
			else {
				count ++;
				n[i] = count;
				
			}
			
			
		}
		
		count = 1000;
		
		for(int i=str.length()-1; i >= 0; i--) {
			
			if(s[i] == c) {
				count = 0;
				
			}
			else {
				count ++;
				n[i] = Math.min(count, n[i]);
				
			}
		}
		for(int i = 0; i < str.length(); i++) {
		System.out.println(n[i]);
		}
		return answer;
	}

	public static void main(String[] args) {

		Q10 T = new Q10();

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char c = sc.next().charAt(0);

		System.out.println(T.solution(str, c));

	}
}