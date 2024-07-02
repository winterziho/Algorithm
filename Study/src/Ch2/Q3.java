package Ch2;

import java.util.*;

public class Q3 {

	public String solution(int n, int[] arr1, int[] arr2) {

		String answer = "";
		
		for(int i = 0; i < n; i++) {
			
			if(arr1[i] == arr2[i]) answer += "D";
			else if(arr1[i] == 1 && arr2[i] == 3) answer += "A";
			else if(arr1[i] == 2 && arr2[i] == 1) answer += "A";	
			else if(arr1[i] == 3 && arr2[i] == 2) answer += "A";	
			else answer+= "B";
		}
		
	
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {

		Q3 T = new Q3();

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for(int i = 0; i < n; i ++) {
			arr1[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i ++) {
			arr2[i] = sc.nextInt();
		}

		System.out.println(T.solution(n, arr1, arr2));

	}
}