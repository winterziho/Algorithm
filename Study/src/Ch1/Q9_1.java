package Ch1;

import java.util.Scanner;

public class Q9_1 {

	public int solution(String str) {
		
		int answer=0;
		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) answer = answer*10+(x-48);
		}
		return answer;
	}
	public static void main(String[] args) {

		Q9_1 T = new Q9_1();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(T.solution(str));

	}
}
