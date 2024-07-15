// Runtime Error
package Ch3;

import java.util.*;

public class Q1_me {

	public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2) {

		ArrayList<Integer> answer = new ArrayList<>();
		
		int cnt = 0;
		
		for(int i = 0; i < n; i ++) {
			
			for(int j = cnt; j < m; j ++) {
				if(arr1[i] >= arr2[j]) {
					answer.add(arr2[j]);
					cnt++;
				
				}else {
					answer.add(arr1[i]);
					if(i == n-1) {
						for(j = cnt; j < m; j ++) {
							answer.add(arr2[j]);
						}
					}
					break;
				}
				
			}
			
			
		}
	for(int i = 0; i < n+m; i++) {
	System.out.print(answer.get(i) + " ");
	}
		return answer;

	}

	public static void main(String[] args) {

		Q1_me T = new Q1_me();

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i ++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i = 0; i < m; i ++) {
			arr2[i] = sc.nextInt();
		}

		T.solution(n, arr1, m, arr2);

	}
}