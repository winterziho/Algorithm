package Ch1;

import java.util.Scanner;

public class Q7_2 {
	
	public String solution(String str) {
		
		String answer="NO";
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer="YES";
		return answer;
	}
	public static void main(String[] args) {

		Q7_2 T = new Q7_2();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(T.solution(str));

	}
}
