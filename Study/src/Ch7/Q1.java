package Ch7;

import java.util.*;

public class Q1 {
	
	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}

	

	
	public static void main(String[] args) {

		Q1 T = new Q1();

		T.DFS(3);
		
	}
}