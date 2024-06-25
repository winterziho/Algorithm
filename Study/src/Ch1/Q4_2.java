package Ch1;

import java.util.*;

public class Q4_2 {
	
	public ArrayList<String> solution(String[] str, int num){
		
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			
			char[] s = x.toCharArray();
			
			int lt = 0;
			int rt = x.length()-1;
			
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}

	public static void main(String[] args) {
		
		Q4_2 T = new Q4_2();
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String[] str = new String[num];
		
		for(int i = 0; i < num; i++) {
			str[i] = sc.next();
		}
		
		for(String x : T.solution(str, num)) {
		System.out.println(x);
		}
	}
}
