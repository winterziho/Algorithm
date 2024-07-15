// Time Limit Exceeded
package Ch3;

import java.util.*;

public class Q2_me {

	public ArrayList<Integer> solution(int n, int[] a, int m, int[] b) {

		ArrayList<Integer> answer = new ArrayList<>();
		
		Arrays.sort(a);
		
		
			
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < m; j ++) {
				if(a[i] == b[j]) {
					answer.add(a[i]);
					break;
				}
			}
		}
		
		
		
	for(int i = 0; i < answer.size(); i++) {
	System.out.print(answer.get(i) + " ");
	}
		return answer;

	}

	public static void main(String[] args) {

		Q2_me T = new Q2_me();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i ++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i = 0; i < m; i ++) {
			b[i] = sc.nextInt();
		}

		T.solution(n, a, m, b);

	}
}