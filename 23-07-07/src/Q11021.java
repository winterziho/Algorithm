
import java.util.Scanner;

public class Q11021 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] sum = new int[T];
		
		for(int x= 0; x < T; x++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			sum[x] = A + B;
			System.out.println("Case #" + (x+1) +": " + sum[x]);
		}
		
	}
}
		
	


