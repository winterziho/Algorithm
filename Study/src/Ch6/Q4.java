package Ch6;

import java.util.*;



public class Q4 {

	public void solution(int s, int n, int[] m) {

		int[] cache = new int[s];
		
		for(int x : m) {
			
			int pos = -1;
			
			for(int i = 0; i < s; i++) {
				
				if(x ==cache[i]) pos = i;
				
			}
			if(pos==-1) {
				
				for(int i = s-1; i >= 1; i--) {
					
					cache[i] = cache[i-1];
					
				}
				
				cache[0] = x;
				
			}else {
				
				for(int i = pos; i >=1; i--) {
					
					cache[i] = cache[i-1];
					
				}
				cache[0]=x;
			}
		}
		for(int x : cache) {
			System.out.print(x + " ");
		}
		
	}

	public static void main(String[] args) {

		Q4 T = new Q4();

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] m = new int[n];
		
		for(int i = 0; i < n; i ++) {
			m[i] = sc.nextInt();
		}
		

		T.solution(s, n, m);

	}
}