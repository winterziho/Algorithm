package test;

import java.util.*;

public class test {

	public int solution(int n, int k, int[] arr) {

		int answer = -1, cnt = 0;
		TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j <n; j++) {
				for(int l = j+1; l < n; l++) {
					tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		
		for(int x : tset) {
			cnt++;
			if(cnt == k) return x;
		}
		return answer;
		
	}

	public static void main(String[] args) {

		test T = new test();
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] arr = new int[a];
		for(int i = 0 ; i < a; i ++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(a, b, arr));

	}
}