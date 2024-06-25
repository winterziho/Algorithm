package Ch1;

import java.util.*;

public class Q3 {
	
	public String solution(String str) {
		
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		while((pos = str.indexOf(' '))!= -1) {
			
			String tmp = str.substring(0, pos);
			int x = tmp.length();
			
			if(x > m) {
				answer = tmp;
				m = x;
			}
			str=str.substring(pos+1);
		}
		
		if (str.length()>m) answer = str;
		
		
//		String[] s = str.split(" ");
//		
//		for(String x : s) {
//			
//			int num = x.length();
//			
//			if (num > m) {
//				
//				answer = x;
//				m = num;
//			}
//		}
		return answer;
	}

	public static void main(String args[]) {
		
		Q3 T = new Q3();
		
		Scanner sc = new Scanner(System.in);
		String src = sc.nextLine();
		
		System.out.println(T.solution(src));
		
	}
}
