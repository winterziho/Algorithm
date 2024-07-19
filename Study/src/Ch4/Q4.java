package Ch4;

import java.util.*;

public class Q4 {

	public void solution(String a, String b) {

		HashMap<Character, Integer> amap = new HashMap<>();
		HashMap<Character, Integer> bmap = new HashMap<>();
		
		int answer = 0, lt = 0;
		char[] arr = a.toCharArray();
		
		
		for(char x : b.toCharArray()) {
			bmap.put(x, bmap.getOrDefault(x, 0) + 1);
		}
		for(int i = 0; i < b.length()-1; i ++) {
			amap.put(arr[i], amap.getOrDefault(arr[i], 0) + 1);
		}
		for(int rt = b.length()-1; rt<a.length(); rt++) {
			amap.put(arr[rt], amap.getOrDefault(arr[rt], 0) + 1);
			
			if(bmap.equals(amap)) {
				answer ++;
			}
			amap.put(arr[lt], amap.get(arr[lt]) -1);
			if(amap.get(arr[lt]) == 0) amap.remove(arr[lt]);
			lt++;
		}
		
		
		System.out.println(answer);
	}

	public static void main(String[] args) {

		Q4 T = new Q4();
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		T.solution(a, b);

	}
}