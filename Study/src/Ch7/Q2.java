package Ch7;

public class Q2 {
	
	public void DFS(int n) {
		
		if(n == 0) return;
		else {
			DFS(n/2);
			System.out.println(n%2);
		}
	}
	
	public static void main(String[] args){
		
		Q2 T = new Q2();
		T.DFS(11);
		
	}

}
