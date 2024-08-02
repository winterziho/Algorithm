package Ch7;

import java.util.*;

public class Q14 {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public void BFS(int v) {
		ch[v]=1;
		dis[v] = 0;
		Queue<Integer> Q = new LinkedList<>();
		Q.offer(v);
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv]=1;
					Q.offer(nv);
					dis[nv]=dis[cv]+1;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		
		Q14 T = new Q14();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		for(int i = 0; i<= 2; i++) {
			System.out.println(i+ " : " + dis[i]);
		}
	}

}
