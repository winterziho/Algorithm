package Ch4;

import java.util.*;

public class Q1 {

	public String solution(String a, String b) {

		String answer = "YES";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : a.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		for(char key : b.toCharArray()) {
			
			if(!map.containsKey(key) || map.get(key) == 0) return "NO";
			map.put(key, map.get(key) -1);
		}
		
		
		return answer;
	}

	public static void main(String[] args) {

		Q1 T = new Q1();

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		
		

		System.out.println(T.solution(a, b));

	}
}