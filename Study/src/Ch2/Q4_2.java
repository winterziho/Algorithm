package Ch2;

import java.util.*;

public class Q4_2 {

	public void solution(int n) {

		int a = 1, b =1, c;
		
		System.out.println(a + " " + b + " ");
		for(int i = 2; i < n; i ++) {
			
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
			
		}
	

	public static void main(String[] args) {

		Q4_2 T = new Q4_2();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		T.solution(n);
		

	}
}