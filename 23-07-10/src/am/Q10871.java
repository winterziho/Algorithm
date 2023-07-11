package am;
import java.util.Scanner;
import java.util.Arrays;

public class Q10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++ ) {
			A[i] = sc.nextInt();
		}
		
		for(int i =0; i < A.length; i++) {
			if(A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
		sc.close();
	}

}
