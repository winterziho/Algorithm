package Ch7;

public class Q3 {
	
	public int DFS(int n) {
		
		if(n == 1) return 1;
		else return n*DFS(n-1);
	}
	
	public static void main(String[] args) {
		Q3 T = new Q3();
		System.out.println(T.DFS(5));
	}

}
