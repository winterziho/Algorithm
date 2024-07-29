package Ch6;

import java.util.*;

public class Q10 {
	
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}

	

	
	public static void main(String[] args) {

		Q10 T = new Q10();

		T.DFS(3);
		
	}
}