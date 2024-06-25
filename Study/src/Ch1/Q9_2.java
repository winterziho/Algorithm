package Ch1;

import java.util.Scanner;

public class Q9_2 {
	
	public int solution(String str) {
		
		String answer="";
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer+=x; //불변이지만 +=가 가능한 이유는 += 연산자가 내부적으로 새로운 String 객체를 생성하기 때
		}
		return Integer.parseInt(answer);
	}
	public static void main(String[] args) {

		Q9_2 T = new Q9_2();

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(T.solution(str));

	}

}
