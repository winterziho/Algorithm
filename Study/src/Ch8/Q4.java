package Ch8;

import java.util.*;

public class Q4 {
	
	static int n, m;
	static int[] pm;
	
	public void DFS(int L) {
		if(L==m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		}else {
			for(int i=1; i<=n; i++) {
				pm[L]=i;
				DFS(L+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Q4 T = new Q4();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pm=new int[m];
		T.DFS(0);
	}

}
