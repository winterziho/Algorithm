package Ch5;

import java.util.*;

public class Q6 {

	public void solution(int n, int k) {
		
		Queue<Integer> Q = new LinkedList<>();
		int answer = 0;
		
		for(int i = 1; i <= n; i++) Q.offer(i);
		while(!Q.isEmpty()) {
			for(int i = 0; i < k-1; i++) Q.offer(Q.poll());
			Q.poll();
			if(Q.size()==1) answer = Q.poll();
		}
		System.out.println(answer);
	}

	public static void main(String[] args) {

		Q6 T = new Q6();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		T.solution(n, k);

	}
}