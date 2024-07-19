package Ch4;

import java.util.*;

public class Q3 {

	public void solution(int n, int k, int[] arr) {

		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int lt = 0;
		
		for(int rt = 0; rt < k-1; rt ++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
		}
		for(int rt = k-1; rt < n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
			
			answer.add(map.size());
			
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
			lt++;
			
		}
		
		for(int i = 0 ; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
		

	}

	public static void main(String[] args) {

		Q3 T = new Q3();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}
		
		T.solution(n, k, arr);

	}
}