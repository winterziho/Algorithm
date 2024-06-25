package Ch1;

import java.util.*;

public class Q4_1 {
	
	public ArrayList<String> solution(String[] str, int n){
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		Q4_1 T = new Q4_1();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		
		for(int i = 0; i<n; i++) {
			str[i] = sc.next();
		}
		
		for(String x : T.solution(str, n)) {
			System.out.println(x);
		}
		
		
		
	}
}
