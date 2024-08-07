package Ch8;

import java.util.Scanner;

public class Q7 {
	
	int[][] dy = new int[35][35]; // 이미 계산된 조합을 저장하기 위한 2차원 배열
	
	public int DFS(int n, int r) {
		
		if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r]=DFS(n-1, r-1)+DFS(n-1, r);
	}
	
	public static void main(String[] args) {
		Q7 T = new Q7();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		System.out.println(T.DFS(n, r));
	}

}
