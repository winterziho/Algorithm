package Ch5;

import java.util.*;

public class Q3 {

	public void solution(int n, int[][] m, int a, int[] arr) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < a; i++) {
			int lt = 0;
			while(lt < n) {
				if(m[lt][arr[i]-1]!= 0) {
					if(!stack.isEmpty() && stack.peek() == m[lt][arr[i]-1]) {
						stack.pop();
						answer += 2;
					}
					else {
					stack.push(m[lt][arr[i]-1]);
					}
					m[lt][arr[i]-1] = 0;
					break;
				}
				
				lt++;
				}
				
			}
		
		System.out.println(answer);
	}

	public static void main(String[] args) {

		Q3 T = new Q3();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] m = new int[n][n];
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < n; j ++) {
				m[i][j] = sc.nextInt();
			}
		}
		int a = sc.nextInt();
		int[] arr = new int[a];
		for(int i = 0; i < a; i ++) {
			arr[i] = sc.nextInt();
		}
		
		T.solution(n, m, a, arr);

	}
}