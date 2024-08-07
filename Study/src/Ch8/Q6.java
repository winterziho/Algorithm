package Ch8;

import java.util.*;

public class Q6 {
	
	static int n, m;
	static int[] ch, arr, pm;
	
	
	public void DFS(int L, int[] arr) {
		
		if(L==m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		}else {
			for(int i=0; i<n; i++) {
				if(ch[i]==0) {
					ch[i]=1;
					pm[L]=arr[i];
					DFS(L+1, arr);
					ch[i]=0;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		Q6 T = new Q6();
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		m=sc.nextInt();
		ch=new int[n];
		pm=new int[m];
		arr=new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		T.DFS(0, arr);
		
	}

}
