package Ch6;

import java.util.*;



public class Q5 {

	public String solution(int n, int[] arr) {

		String answer = "U";
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			if(arr[i] == arr[i+1]) return "D";
		}
		return answer;
	}

	public static void main(String[] args) {

		Q5 T = new Q5();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n,arr));
		
	}
}