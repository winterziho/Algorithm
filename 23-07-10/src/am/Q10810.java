package am;
import java.util.*;
public class Q10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		
		for(int x = 0; x < M; x++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			while(i-1<=j-1) {
				arr[i - 1] = k;
				i++;
			}
		}
		for(int i = 0; i < N; i++) {
		System.out.print(arr[i] + " ");
		sc.close();
		}
	}

}
